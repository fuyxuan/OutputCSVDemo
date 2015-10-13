import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		String fileName = System.getProperty("user.home") + "/student.csv";

		System.out.println("Write CSV file:");
		CsvFileWriter.writeCsvFile(fileName);
		System.out.println("\nRead CSV file:");
		CsvFileReader.readCsvFile(fileName);
	}

	//http://examples.javacodegeeks.com/core-java/writeread-csv-files-in-java-example/
}
