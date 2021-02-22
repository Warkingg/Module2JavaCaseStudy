package behaviors;

import Entities.Student;
import readwritefile.fileObject;

import java.util.ArrayList;

public class StudentManagement {
    ArrayList<Student> students = new ArrayList<>();
    final String PATH ="D:\\Work\\Codegym\\Java Example Demo\\javaconsole4\\src\\student.dat";

    public void addStudent(Student student){

        students.add(student);
        fileObject.writeObjectToFile(students,PATH);
    }
    public void updateStudent(Student student){
        for (Student student1 : students){
            if(student1.getId() == student.getId()){
                student1.setName(student.getName());
                student1.setClassName(student.getClassName());
            }
        }
    }
    public void deleteStudent(int id){
        fileObject.readFromFile(PATH);
        students.removeIf(st->st.getId()==id);{
        }
    }
    public Student getStudentById(int id){
        fileObject.readFromFile(PATH);
        Student student = new Student ();
        for (Student st : students){
            if (st.getId() == id){
                student = st;
            }
        }
        return student;
    }
    public void showAllStudent(){
        fileObject.readFromFile(PATH);
        for (Student st:students){
            System.out.println(st.toString());
        }
    }
}
