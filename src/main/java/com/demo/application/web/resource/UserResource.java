package com.demo.application.web.resource;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.demo.application.web.model.request.NewUserRequest;
import com.demo.domain.model.constants.ValidationMessages;

@Path("/api/v1/users")
public class UserResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createUser(
        @Valid @NotNull(message = ValidationMessages.REQUEST_BODY_MUST_BE_NOT_NULL) NewUserRequest newUserRequest
        ) {
            
        return Response.ok().status(Response.Status.CREATED).build();
    }
}