package jd2.baggins.pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Occupation {
    private int id;
    private String position;
    private String studDepartment;
    private String studGroup;
    private String studCourse;
    @Autowired
//    @Qualifier("employer2")
    private Employer employer;

    public Occupation() {
    }

    public Occupation(int id, String position, String studDepartment, String studGroup, String studCourse, Employer employer) {
        this.id = id;
        this.position = position;
        this.studDepartment = studDepartment;
        this.studGroup = studGroup;
        this.studCourse = studCourse;
        this.employer = employer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStudDepartment() {
        return studDepartment;
    }

    public void setStudDepartment(String studDepartment) {
        this.studDepartment = studDepartment;
    }

    public String getStudGroup() {
        return studGroup;
    }

    public void setStudGroup(String studGroup) {
        this.studGroup = studGroup;
    }

    public String getStudCourse() {
        return studCourse;
    }

    public void setStudCourse(String studCourse) {
        this.studCourse = studCourse;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    @Override
    public String toString() {
        return "Occupation{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", studDepartment='" + studDepartment + '\'' +
                ", studGroup='" + studGroup + '\'' +
                ", studCourse='" + studCourse + '\'' +
                ", employer=" + employer +
                '}';
    }
}
