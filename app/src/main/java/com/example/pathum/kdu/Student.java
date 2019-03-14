package com.example.pathum.kdu;

public class Student {
    String studentReg;
    String studentName;
    String studentAddress;
    String studentContact;
    String studentNic;

    public Student(){

    }

    public Student(String studentReg, String studentName, String studentAddress, String studentContact, String studentNic) {
        this.studentReg = studentReg;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentContact = studentContact;
        this.studentNic = studentNic;
    }

    public String getStudentReg() {
        return studentReg;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public String getStudentContact() {
        return studentContact;
    }

    public String getStudentNic() {
        return studentNic;
    }

    public void setStudentReg(String studentReg) {
        this.studentReg = studentReg;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }

    public void setStudentNic(String studentNic) {
        this.studentNic = studentNic;
    }
}
