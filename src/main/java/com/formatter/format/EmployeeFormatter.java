package com.formatter.format;

import java.util.Formatter;

public class EmployeeFormatter {

    public
    static void main(String[] args) {
        Formatter formatter = new Formatter();
// Format the data to display in the console

        formatter.format("%-15s %-18s %10s\n ", "Employee Name ", " ID ", " Salary ");
        formatter.format("%-15s %-17d %10.2f\n", "John Doe", 101, 4500.50);
        formatter.format("%-15s %-10d %10.2f\n", "Jane Smith", 102, 5500.75);
        formatter.format("%-15s %-10d %10.2f\n", "Alice Brown", 103, 6300.00);
        // Display the data in the console
        System.out.println(formatter);

// Close the formatter to prevent resource leaks
        formatter.close();


    }
}
