package be.syntra.DisneyProject.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "highscore")
public class Highscore {

    //nakijken
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long highscoreId;

    @ManyToOne
    @JoinColumn(name = "user_email", nullable=false,unique = true)
    private User user;

    @Column(name = "score")
    private String score;

    @Column (name = "Date")
    private Date date;

}
