package Views;

import Entities.Book;
import Entities.Card;
import Entities.Student;
import behaviors.BookManagement;
import behaviors.CardManagement;
import behaviors.StudentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    static StudentManagement sm = new StudentManagement();
    static CardManagement cm = new CardManagement();
    static BookManagement bm = new BookManagement();

    public static void main(String[] args) {
        Menu:
        do {
            System.out.print("----------Menu----------" +
                    "\n1: Student Managment" +
                    "\n2: Book Management" +
                    "\n3: Card Management" +
                    "\nEnter your choice: ");
            try {
                int choice1 = Integer.parseInt(scanner.nextLine());
                switch (choice1) {
                    case 1:
                        do {
                            System.out.print("------Student Management------" +
                                    "\n1: Add Student" +
                                    "\n2: Update student" +
                                    "\n3: Delete Student" +
                                    "\n4: Display a student" +
                                    "\n5: Show all student" +
                                    "\n0: Back" +
                                    "\nEnter choice: ");
                            try {
                                int choice2 = Integer.parseInt(scanner.nextLine());
                                switch (choice2) {
                                    case 1:
                                        Student student = Menu.getInfoStudent();
                                        sm.addStudent(student);
                                        break;
                                    case 2:
                                        Student student1 = Menu.getInfoStudent();
                                        sm.updateStudent(student1);
                                        break;
                                    case 3:
                                        System.out.print("Please enter student's id: ");
                                        int id = Integer.parseInt(scanner.nextLine());
                                        sm.deleteStudent(id);
                                        break;
                                    case 4:
                                        System.out.print("Please enter student's id: ");
                                        int id1 = Integer.parseInt(scanner.nextLine());
                                        System.out.println(sm.getStudentById(id1).toString());
                                        break;
                                    case 5:
                                        sm.showAllStudent();
                                        break;
                                    case 0:
                                        continue Menu;
                                    default:
                                        System.out.println("Input Error. Try Again");
                                }
                            } catch (Exception e) {
                                System.err.println("Input Error");
                            }
                        } while (true);
                    case 2:
                        do {
                            System.out.print("------Book Management------" +
                                    "\n1: Add Book" +
                                    "\n2: Update Book" +
                                    "\n3: Delete Book" +
                                    "\n4: Display a Book" +
                                    "\n5: Show all Book" +
                                    "\n0: Back" +
                                    "\nEnter choice: ");
                            try {
                                int choice3 = Integer.parseInt(scanner.nextLine());
                                switch (choice3) {
                                    case 1:
                                        Book book = Menu.getInfoBook();
                                        bm.addBook(book);
                                        break;
                                    case 2:
                                        Book book1 = Menu.getInfoBook();
                                        bm.updateBook(book1);
                                        break;
                                    case 3:
                                        System.out.print("Please enter book's id: ");
                                        int id = Integer.parseInt(scanner.nextLine());
                                        bm.deteleBook(id);
                                        break;
                                    case 4:
                                        System.out.print("Please enter book's id: ");
                                        int id1 = Integer.parseInt(scanner.nextLine());
                                        System.out.println(bm.getBookById(id1).toString());
                                        break;
                                    case 5:
                                        bm.showAllBook();
                                        break;
                                    case 0:
                                        continue Menu;
                                    default:
                                        System.out.println("Input Error. Try Again");
                                }
                            } catch (Exception e) {
                                System.err.println("Input Error");
                            }
                        } while (true);
                    case 3:
                        do {
                            System.out.print("------Card Management------" +
                                    "\n1: Add Card" +
                                    "\n2: Display a Card" +
                                    "\n3: Show all Card" +
                                    "\n0: Back" +
                                    "\nEnter choice: ");
                            try {
                                int choice4 = Integer.parseInt(scanner.nextLine());
                                switch (choice4) {
                                    case 1:
                                        ArrayList<Book> books = new ArrayList<>();
                                        System.out.print("Please enter card's id: ");
                                        int id = Integer.parseInt(scanner.nextLine());
                                        System.out.print("Please enter student's id: ");
                                        int idst = Integer.parseInt(scanner.nextLine());
                                        Student st = sm.getStudentById(idst);
                                        System.out.print("Please enter book quantity: ");
                                        int quantity = Integer.parseInt(scanner.nextLine());
                                        for (int i = 0; i < quantity; i++) {
                                            System.out.println("Please enter book's id: ");
                                            int idb = Integer.parseInt(scanner.nextLine());
                                            Book b = bm.getBookById(idb);
                                            books.add(b);
                                        }
                                        Card card = new Card(id, st, books);
                                        cm.addCard(card);
                                        break;
                                    case 2:
                                        System.out.print("Please enter card's id: ");
                                        int idc = Integer.parseInt(scanner.nextLine());
                                        System.out.println(cm.getCardById(idc).toString());
                                        break;
                                    case 3:
                                        cm.showAllCard();
                                        break;
                                    case 0:
                                        continue Menu;
                                    default:
                                        System.err.println("Input error. Try again");
                                }
                            } catch (Exception e) {
                                System.err.println("Input Error");
                            }
                        } while (true);
                }
            } catch (Exception e) {
                System.err.println("Input Error");
            }
        } while (true);
    }
}