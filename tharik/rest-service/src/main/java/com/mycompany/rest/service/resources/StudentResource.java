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

/**
 *
 * @author 
 */
@Path("students")
public class StudentResource {
    Gson gson = new Gson();

    public StudentResource() {
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudents(){ 
        
        
        return Response
                .ok(gson.toJson(new DBUtils().getStudents()))
                .build();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudent(@PathParam("id") int id){ 
        try {
        Student student = new DBUtils().getStudent(id);
        
        if (student != null) {
                  return Response
                    .ok(gson.toJson(student))
                    .build();
        } 

        return Response
                .status(Response.Status.NOT_FOUND)
                .build();
        } catch(Exception e) {
             return Response
                .status(Response.Status.INTERNAL_SERVER_ERROR)
                .build();
        }
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addStudent(String json){ 
        Student student = gson.fromJson(json, Student.class); 
        new DBUtils().addStudent(student);
        return Response
                .status(Response.Status.CREATED)
                .build();
    }
    
    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateStudent(String json, @PathParam("id") int id){ 
        Student student = gson.fromJson(json, Student.class);
        new DBUtils().updateStudent(student);
        return Response
                    .ok()
                    .build();
    }
    
    
    @DELETE
    @Path("{id}")
    public Response deleteStudent(@PathParam("id") int id){ 
        new DBUtils().deleteStudent(id);
        return Response
            .ok()
            .build();
    }
}
