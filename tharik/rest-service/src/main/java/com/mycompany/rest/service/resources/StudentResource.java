package com.mycompany.rest.service.resources;

import com.google.gson.Gson;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
@Path("students")
public class StudentResource {
    static List<Student> students = new ArrayList<>();
    Gson gson = new Gson();

    public StudentResource() {
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudents(){ 
        return Response
                .ok(gson.toJson(students))
                .build();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudent(@PathParam("id") int id){ 
        for (Student st : students) {
            if (st.getId() == id) {
                return Response
                    .ok(gson.toJson(st))
                    .build();
            }
        }
        
        return Response
                .status(Response.Status.NOT_FOUND)
                .build();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addStudent(String json){ 
        Student student = gson.fromJson(json, Student.class); 
        students.add(student);
        return Response
                .status(Response.Status.CREATED)
                .build();
    }
    
    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateStudent(String json, @PathParam("id") int id){ 
        Student student = gson.fromJson(json, Student.class);
        
        for (Student st : students) {
            if (st.getId() == id) {
                students.set(students.indexOf(st), student);
                return Response
                    .ok()
                    .build();
            }
        }
  
        return Response
                .status(Response.Status.NOT_FOUND)
                .build();
    }
    
    
    @DELETE
    @Path("{id}")
    public Response deleteStudent(@PathParam("id") int id){ 
        for (Student st : students) {
            if (st.getId() == id) {
                students.remove(st);
                return Response
                    .ok(gson.toJson(st))
                    .build();
            }
        }
        
        return Response
                .status(Response.Status.NOT_FOUND)
                .build();
    }
}
