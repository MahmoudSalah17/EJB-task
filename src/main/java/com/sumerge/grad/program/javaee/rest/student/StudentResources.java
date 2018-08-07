package com.sumerge.grad.program.javaee.rest.student;

import com.sumerge.grad.program.javaee.entity.Course;
import com.sumerge.grad.program.javaee.entity.Student;
import com.sumerge.grad.program.javaee.entity.StudentCourse;
import com.sumerge.grad.program.javaee.entity.StudentModel;
import com.sumerge.grad.program.javaee.rest.Repo;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.logging.Logger;

import static com.sumerge.grad.program.javaee.constants.Constants.PERSISTENT_UNIT;
import static java.util.logging.Level.SEVERE;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@RequestScoped
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@Path("students")
public class StudentResources {

    private static final Logger LOGGER = Logger.getLogger(StudentResources.class.getName());

    @EJB
    private Repo repo;

    @PersistenceContext(unitName = PERSISTENT_UNIT)
    private EntityManager em;

    @GET
    @Transactional
    public Response getStudentGpa(@QueryParam("id") Long id) {
        try
        {
            return Response.ok().entity(repo.updateStudentGpaById(id)).build();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return Response.serverError().build();
        }
    }
}
