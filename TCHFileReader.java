package tch;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TCHFileReader {
	
	private static final String FILE_NAME="resources\\data.csv";

	public static void main(String[] args) throws IOException {
		List<BankModel> list = readCSVFile(FILE_NAME);
		queryData(list);
	}

	public static List<BankModel> readCSVFile(String fileName) throws IOException{
		final String COMMA_SEPARATOR = ",";
		List<BankModel> list = null;
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line = "";
			list = new ArrayList<BankModel>();
			boolean header = true;
			while ((line = br.readLine()) != null) {
				// This skips the header line 
				if(header) { 
					header = false;
					continue;
				}
				String[] values = line.split(COMMA_SEPARATOR);
				list.add(new BankModel(Integer.parseInt(values[0]),values[1],values[2],values[3],values[4],Integer.parseInt(values[5])));
			}
		} catch(IOException e) {
			System.out.println("IOException Occured");
			throw e;
		}
		return list;
	}
	
	public static void queryData(List<BankModel> list) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("\nSearch criteria options :: id(1) \tBankName(2) \tType(3) \tCity(4) \tState(5) \tZip(6) \tCity and State(7) \tExit(any other key):");
			int option = in.nextInt();
			if(option == 1) {
				System.out.println("Enter value - ID: ");
				int id = in.nextInt();
				list.stream().parallel().filter(x -> x.id == id).forEach(System.out::println);
			}
			else if(option == 2) {
				System.out.println("Enter value - BankName: ");
				String bankName = new Scanner(System.in).nextLine();
				list.stream().parallel().filter(x -> x.bankName.equalsIgnoreCase(bankName)).forEach(System.out::println);
			} 
			else if(option == 3) {
				System.out.println("Enter value - Type: ");
				String type = new Scanner(System.in).nextLine();
				list.stream().parallel().filter(x -> x.type.equalsIgnoreCase(type)).forEach(System.out::println);
			} 
			else if(option == 4) {
				System.out.println("Enter value - City: ");
				String city = new Scanner(System.in).nextLine();
				list.stream().parallel().filter(x -> x.city.equalsIgnoreCase(city)).forEach(System.out::println);
			} 
			else if(option == 5) {
				System.out.println("Enter value - State: ");
				String state = new Scanner(System.in).nextLine();
				list.stream().parallel().filter(x -> x.state.equalsIgnoreCase(state)).forEach(System.out::println);
			} 
			else if(option == 6) {
				System.out.println("Enter value - Zip code: ");
				int zip = in.nextInt();
				list.stream().parallel().filter(x -> x.zip == zip).forEach(System.out::println);
			} 
			else if(option == 7) {
				System.out.println("Enter the value - City: ");
				String city = new Scanner(System.in).nextLine();
				System.out.println("Enter the value - State: ");
				String state = new Scanner(System.in).nextLine();
				
				list.stream().parallel().filter(x -> x.city.equalsIgnoreCase(city) && x.state.equalsIgnoreCase(state)).forEach(System.out::println);
			}
			else {
				break;
			}
		}
	}
}

