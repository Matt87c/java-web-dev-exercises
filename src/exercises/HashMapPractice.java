package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main (String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;
        System.out.println ("Enter your student's name (or ENTER to finish): ");

        do {
            System.out.print("Student Name: ");
            studentName = input.nextLine();

            if (!studentName.equals ("")) {

                System.out.print ("Student ID Number: ");
                int idNumber = input.nextInt();
                students.put(idNumber, studentName);

                input.nextLine();

            }

        } while (!studentName.equals (""));

        input.close();

        printStudents(students);

    }

    static void printStudents (HashMap<Integer, String> students) {

        for (Map.Entry<Integer, String> student: students.entrySet()) {

            System.out.println (student.getValue() + " (" + student.getKey() + ")");

        }

    }

}