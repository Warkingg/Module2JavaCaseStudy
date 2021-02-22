package Entities;
import java.io.Serializable;
import java.util.List;

public class Card implements Serializable {
    private int id;
    private Student student;
    private List<Book> books;
    private String Date;
    private String returnDate;

    public Card (int id,Student student, List<Book> books){
        this.id = id;
        this.student = student;
        this.books = books;
    }

    public Card() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", student=" + student +
                ", books=" + books +
                '}';
    }
}
