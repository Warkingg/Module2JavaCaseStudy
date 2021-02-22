package Views;

import Entities.Book;
import Entities.Student;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static Book getInfoBook(){
        System.out.println("Enter book's id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter book's name: ");
        String name = scanner.nextLine();
        return new Book(id,name);
    }
    public static Student getInfoStudent(){
        System.out.println("Enter student's id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student's class: ");
        String className = scanner.nextLine();
        return new Student (id,name,className);
    }
}
