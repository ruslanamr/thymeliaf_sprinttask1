package kz.thymeliaf.db;

import java.util.ArrayList;
import java.util.List;
import kz.thymeliaf.model.Student;

public class DbManager {
  static int id=6;
  public static List<Student> students = new ArrayList<>();

  static {
  students.add(new Student(1, "Руслан", "Амраев", 95, "A"));
  students.add(new Student(2, "Назгуль", "Асанбаева", 75, "A"));
  students.add(new Student(3, "Куат", "Абылай", 49, "F"));
  students.add(new Student(4, "Ануар", "Имашев", 50, "C"));
  students.add(new Student(5, "Аян", "Нургали", 91, "A"));
  }
  public static List<Student> getStudents(){
    return students;
  }
  public static void addStudent(Student student){
    student.setId(id);
    students.add(student);
    id++;
  }
}
