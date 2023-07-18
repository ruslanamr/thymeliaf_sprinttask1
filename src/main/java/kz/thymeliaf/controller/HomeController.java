package kz.thymeliaf.controller;

import kz.thymeliaf.db.DbManager;
import kz.thymeliaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String home(Model model){
    model.addAttribute("students", DbManager.getStudents());
    return "home";
  }

  @GetMapping("/addstudent")
  public String addStudent(){
    return "addstudent";
  }
  @PostMapping("/addstudentobj")
  public String addStudentObj(Student student){
    if (student.getExam()>=90) {
      student.setMark("A");
    } else if (student.getExam()>=75 && student.getExam()<89) {
      student.setMark("B");
    } else if (student.getExam()>=60 && student.getExam()<74) {
      student.setMark("C");
    }else if (student.getExam()>=50 && student.getExam()<59) {
      student.setMark("D");
    } else student.setMark("F");
    DbManager.addStudent(student);
    return "redirect:/";
  }
}
