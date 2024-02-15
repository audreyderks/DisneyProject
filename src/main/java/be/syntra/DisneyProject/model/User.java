package be.syntra.DisneyProject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(name = "username", nullable = false, unique = true)
    private String userName;

    @Column(name = "user_email", nullable = false)
    private String UserEmail;

    @Column(name = "password", nullable = false)
    private String password;

    public User(String userName, String userEmail, String password) {
        this.userName = userName;
        UserEmail = userEmail;
        this.password = password;
    }

    // getters & setters
    public long getUserId() {
        return userId;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }
}
