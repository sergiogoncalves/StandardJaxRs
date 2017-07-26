package com.sergio.standard;

import com.sergio.vo.Event;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/event")
@Produces("application/json")
public class EventResource {

    private List events = new ArrayList<>();

    @GET
    public List getList() throws SQLException, NamingException {

        try {

            Event event = new Event();

            event.setId(1);
            event.setTitle("Testando JSON");
            event.setCreated(0);

            events.add(event);

            return events;
        } finally {

        }
    }

 /*   @POST
    public Response postList() throws SQLException, NamingException {

        try {

            Event event = new Event();

            event.setId(events.size() + 1);
            event.setTitle("Testando JSON: " + event.getId());
            event.setCreated(0);

            events.add(event);

            return Response.ok().build();
        } finally {

        }
    }
*/
}
