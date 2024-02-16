package be.syntra.DisneyProject.model;

import jakarta.persistence.*;

@Entity
@Table(name ="favourite_movie" ,uniqueConstraints = { @UniqueConstraint(columnNames = { "user_id", "movie_id" })})
public class FavouriteMovie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long favouriteMovieId;


    @ManyToOne
    @JoinColumn(name = "user_id", nullable=false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;
}
