//only stores data

public class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}

//email validator 

public class EmailValidator{
    public boolean isValid(String email){
        if(email != null && email.contains("@")){
            return true;
        }
        System.out.println("Invalid email format");
        return false;
    }
}

//user repository interface (Dependency Inversion principle)
public interface UserRepository{
    void save(User user);
}


// dataase implementation 

public class DatabaseUserRepository implements UserRepository{

    @Override
    public void save(User user){
        System.out.println("Connecting to database");
        System.out.println("Saving user"+user.getUsername()+"to the users table.");
    }
}
