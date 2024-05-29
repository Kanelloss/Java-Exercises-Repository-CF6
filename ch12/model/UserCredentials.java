package gr.aueb.cf.ch12.model;

public class UserCredentials {
    private long id;
    private String username;
    private String password;

    // Default Constructor
    public UserCredentials() {

    }

    // Overloaded Constructor
    public UserCredentials(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // Getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
