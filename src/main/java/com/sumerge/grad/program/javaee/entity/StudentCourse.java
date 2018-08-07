package com.sumerge.grad.program.javaee.entity;


import com.sumerge.grad.program.javaee.StudentCourseId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "STUDENT_COURSES")
public class StudentCourse implements Serializable {

    @EmbeddedId
    private StudentCourseId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STUDENT_ID", insertable = false, updatable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COURSE_ID", insertable = false, updatable = false)
    private Course course;

    @Column(name = "GRADES")
    private Float grades;

    private StudentCourse() {
    }

    public StudentCourse(Student student, Course course) {
        this.student = student;
        this.course = course;

        this.id = new StudentCourseId(student.getId(), course.getId());
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Float getGrades() {
        return grades;
    }

    public void setGrades(Float grades) {
        this.grades = grades;
    }

    public StudentCourseId getId() {
        return id;
    }

    public void setId(StudentCourseId id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentCourse that = (StudentCourse) o;
        return Objects.equals(student, that.student) &&
                Objects.equals(course, that.course);
    }

    @Override
    public int hashCode() {

        return Objects.hash(student, course);
    }
}
