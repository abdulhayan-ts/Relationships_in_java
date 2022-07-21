package org.example.relationships;

import javax.persistence.*;

@Entity
public class Subjectmaterial {

    @Id
    private int id;
    private String url;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Subject_Id", referencedColumnName = "Id")
    private Subjects subject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Subjectmaterial{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", subject=" + subject +
                '}';
    }
}
