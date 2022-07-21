package org.example.relationships;

import javax.persistence.*;

@Entity
public class Laptops {

    @Id
    private int lid;
    private String lname;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Student_id", referencedColumnName = "rollno")
    private Students student;

    public int getLid() {
        return lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Laptops{" +
                "lid=" + lid +
                ", lname='" + lname + '\'' +
                ", studentID=" + student.getRollno() +
                '}';
    }
}
