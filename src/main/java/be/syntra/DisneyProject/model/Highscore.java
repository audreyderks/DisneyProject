package be.syntra.DisneyProject.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "highscore")
public class Highscore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long highscoreId;

    @ManyToOne
    @JoinColumn(name = "user_email", nullable=false)
    private User user;

    @Column(name = "score")
    private String score;

    @Column (name = "Date")
    private Date date;

    public long getHighscoreId() {
        return highscoreId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
