package training.controller;

import domain.Users;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import service.UserService;

@Path("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @POST
    public Response createUsers(Users users) {
            return Response.ok(userService.createUsers(users)).build();
    }
}
