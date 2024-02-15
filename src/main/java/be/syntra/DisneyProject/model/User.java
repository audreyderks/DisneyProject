package be.syntra.DisneyProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "user_email", unique = true, nullable = false)
    private String UserEmail;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "username", nullable = false)
    private String userName;


// getters & setters
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

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
