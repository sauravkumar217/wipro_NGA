import java.util.Optional;

// Define the UserService interface
interface UserService {
    
    // Default method to return a welcome message
    default String getWelcomeMessage() {
        return "Welcome, Guest!";
    }
    
    // Abstract method to get a user's name wrapped in Optional
    Optional<String> getUser(String name);
}

// Implement the UserService interface
class UserServiceImpl implements UserService {
    
    @Override
    public Optional<String> getUser(String name) {
        return Optional.ofNullable(name);
    }
    
    // Method to get the welcome message based on user presence
    public String getPersonalizedWelcome(String name) {
        return getUser(name).map(n -> "Welcome, " + n + "!")
                            .orElse(getWelcomeMessage());
    }
}

// Main class to test the implementation
public class UserServiceTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        
        // Test cases
        System.out.println(userService.getPersonalizedWelcome("Alice")); 
        System.out.println(userService.getPersonalizedWelcome(null));    
    }
}
