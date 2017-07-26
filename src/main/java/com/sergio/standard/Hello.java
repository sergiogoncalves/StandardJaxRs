package com.sergio.standard;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class Hello {
 
    @GET
    @Path("/{param}/{param2}")
    public Response getMsg(@PathParam("param") String message, @PathParam("param2") String message2) {
        String output = "Hello " + message + "! -" +  message2;
        return Response.status(200).entity(output).build();
    }
}