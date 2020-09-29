/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.festnepal.festinternshiptask1;

/**
 *
 * @author Ayush
 */
public class Student {

    private String firstName;
    private String middleName;
    private String lastName;
    private String faculty;
    private String program;
    private boolean editable;

    public Student() {

    }

    public Student(String firstName, String middleName, String lastName, String faculty, String program) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.program = program;
        editable = false;
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

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean canEdit) {
        this.editable = canEdit;
    }
}
