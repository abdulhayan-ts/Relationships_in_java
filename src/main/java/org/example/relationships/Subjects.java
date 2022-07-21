package org.example.relationships;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Subjects {

    @Id
    private int id;
    private String name;
    @ManyToMany
    @JoinTable(
            name = "students_subjects",
            joinColumns  = @JoinColumn(name = "Course_Id", referencedColumnName = "Id"),
            inverseJoinColumns = @JoinColumn (name = "Student_id", referencedColumnName = "rollno")
    )
    private List<Students> students = new ArrayList<Students>();

    @OneToOne( cascade = CascadeType.ALL, mappedBy = "subject")
    private Subjectmaterial subjectMaterial;


    public Subjectmaterial getSubjectMaterial() {
        return subjectMaterial;
    }

    public void setSubjectMaterial(Subjectmaterial subjectMaterial) {
        this.subjectMaterial = subjectMaterial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
