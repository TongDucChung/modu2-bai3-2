package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ten");
        String input_name = scanner.nextLine();
        boolean isExict = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                isExict = true;
                break;
            }
        }
        if (!isExict) {
            System.out.println("Not found" + input_name + "in the list");
        }
    }
}
