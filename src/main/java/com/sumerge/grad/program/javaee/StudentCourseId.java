package com.sumerge.grad.program.javaee;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class StudentCourseId implements Serializable {


    @Column(name = "STUDENT_ID")
    private Long studentId;

    @Column(name = "COURSE_ID")
    private Long courseId;

    private StudentCourseId(){}

    public StudentCourseId(Long studentId, Long courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentCourseId that = (StudentCourseId) o;
        return Objects.equals(studentId, that.studentId) &&
                Objects.equals(courseId, that.courseId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(studentId, courseId);
    }
}
