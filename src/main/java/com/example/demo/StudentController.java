package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
@RequestMapping(path="/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewStudent (@RequestParam String name
            ) {

        Student n = new Student();
      //  n.setStudentid(4L);
        n.setName(name);

        Book b= new Book();
        b.setName("HOLY");
        b.setStudent(n);
//b.setBookid(4L);
        Book b1= new Book();
        b1.setStudent(n);
     //b1.setBookid(5L);
        b1.setName("DIWALI");



        n.setBookList(Arrays.asList(b,b1));
         studentRepository.save(n);
        return "Saved";
    }



    @PostMapping(path="/delete")
    public @ResponseBody String deleteStudent (@RequestParam Integer rollnumber) {

        studentRepository.delete(studentRepository.findById(rollnumber).get());
        return "delete";
    }


    @GetMapping(path="/all")
    public @ResponseBody Iterable<Student> getAllStudents() {

        return studentRepository.findAll();
    }
}