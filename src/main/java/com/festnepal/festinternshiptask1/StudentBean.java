/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.festnepal.festinternshiptask1;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Ayush
 */
@ManagedBean(name = "student", eager = true)
@SessionScoped
public class StudentBean {
    private static final long serialVersionUID = 1L;   
    
    private String firstName;
    private String middleName;
    private String lastName;
    private String faculty;
    private String program;
    private Student student;
    
    private final ArrayList<Student> studentList;

    public StudentBean() {
        this.studentList = new ArrayList();
    }
    public ArrayList<Student> getStudentList() {
      return studentList;
   }

   public String addStudent() {		 
      Student student = new Student(firstName, middleName, lastName, faculty, program);
      studentList.add(student);
      return null;
   }

   public String deleteStudent(Student student) {
      studentList.remove(student);		
      return null;
   }

   public String editStudent(Student student) {
      student.setEditable(true);
      return null;
   }
      public String saveStudents() {
      
      for (Student student : studentList) {
         student.setEditable(false);
      }		
      return null;
   }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
