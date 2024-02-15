package be.syntra.DisneyProject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long movieId;

    @Column (name = "movie_name", unique = true,nullable = false)
    private String movieName;

    @Column (name = "description")
    private String movieDescription;
}
