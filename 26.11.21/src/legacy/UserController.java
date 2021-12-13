package legacy;

public class UserController {
    private UserService userService;
    private Authentification authentification;

    public UserController(UserService userService) {
        this.userService = userService;
    }

}
