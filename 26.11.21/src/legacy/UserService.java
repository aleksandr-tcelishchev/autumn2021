package legacy;

public class UserService {
    private UserRepository userRepository;
    private DiscountService discountService;

    public UserService(UserRepository userRepository, DiscountService discountService) {
        this.userRepository = userRepository;
        this.discountService = discountService;
    }
}
