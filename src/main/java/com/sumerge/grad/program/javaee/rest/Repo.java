package com.sumerge.grad.program.javaee.rest;

import com.sumerge.grad.program.javaee.entity.Student;
import com.sumerge.grad.program.javaee.entity.StudentCourse;
import com.sumerge.grad.program.javaee.entity.StudentModel;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.core.Response;
import java.util.Collection;

import static com.sumerge.grad.program.javaee.constants.Constants.PERSISTENT_UNIT;

@Stateless
public class Repo {


    @PersistenceContext(unitName = PERSISTENT_UNIT)
    private EntityManager em;

    public StudentModel updateStudentGpaById(Long id)
    {
        Student student = em.find(Student.class, id);
        Collection<StudentCourse> studentCourses = student.getCourses();
        int totalHours = 0;
        float gradePerCourse = 0;
        for (StudentCourse sc: studentCourses) {
            totalHours += sc.getCourse().getHours();
            gradePerCourse += sc.getGrades()*sc.getCourse().getHours();
        }

        student.setGpa(gradePerCourse/totalHours);
        em.merge(student);
        StudentModel sm = new StudentModel(student.getId(), student.getName(), student.getRollNumber(), student.getGender(), student.getDob(),student.getGpa());
        //throw new NullPointerException();
        return sm;
    }

}
