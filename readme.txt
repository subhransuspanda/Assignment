This is a program is to read a csv file and query the fields in Java.

Here is the directory structure 

	src\resources\data.csv
	src\tch\BankModel.java
	src\tch\TCHFileReader.java - is the main file that runs.

This programs runs accurately.

Certainly there are many different ways to implement it. But I prefer not to use any libraries like OpenCSV.

Since it is a small data set we can use it load in a List in memory and do the search operation using Java 8.

Only assumption here is the column order does not change every time we receive file. If it changes, that also can be implemented by -

-When reading the header, place the columns title in a map with a index value as key. And refer the map while populating the BankModel.
