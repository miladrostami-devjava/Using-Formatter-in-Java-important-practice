package com.formatter.filewriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class EmployeeFileWriter {

    public static void main(String[] args) {
        try {
            // ایجاد فایل و Formatter
            File file = new File("src/main/resources/employees.txt");
            Formatter formatter = new Formatter(file);

            // Write formatted data to file

            formatter.format("%-15s %-10s %10s\n", "Employee Name", "ID", "Salary");
            formatter.format("%-15s %-10d %10.2f\n", "John Doe", 101, 4500.50);
            formatter.format("%-15s %-10d %10.2f\n", "Jane Smith", 102, 5500.75);
            formatter.format("%-15s %-10d %10.2f\n", "Alice Brown", 103, 6300.00);

// Close the formatter to save information and prevent resource leakage
            formatter.close();
            System.out.println("Data successfully written to file: employees.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
