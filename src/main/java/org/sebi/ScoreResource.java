package org.sebi;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/score")
public class ScoreResource {

    @Inject
    UsernameGenerator nameGenerator;

    @Inject
    IdentifierGenerator idGenerator;


    @GET
    @Path("/register")
    @Produces(MediaType.APPLICATION_JSON)
    public Response registerUser() {        
        String username = nameGenerator.getName();
        Player player = new Player();
        player.setName(username);
        player.setId(idGenerator.generateId(username));
        return Response.ok(player).build();
    }
}