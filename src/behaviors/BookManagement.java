package behaviors;

import Entities.Book;
import readwritefile.fileObject;

import java.util.ArrayList;

public class BookManagement {
    ArrayList<Book> books = new ArrayList<>();
    final String PATH ="D:\\Work\\Codegym\\Java Example Demo\\javaconsole4\\src\\book.dat";

    public void addBook(Book book){
        books.add(book);
        fileObject.writeObjectToFile(books,PATH);
    }
    public void updateBook(Book book){
        for (Book b : books){
            if(b.getId() == book.getId()){
                b.setName(book.getName());
            }
        }
        fileObject.writeObjectToFile(books,PATH);
    }
    public void deteleBook(int id){
        books.removeIf(b ->b.getId() == id );
    }
    public Book getBookById(int id){
        Book b = new Book();
        for (Book book : books)
            if(book.getId() == id){
                b = book;
            }
        return b;
    }
    public void showAllBook(){
        for (Book book : books){
            System.out.println(book.toString());
        }
    }
}
