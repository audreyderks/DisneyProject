package be.syntra.DisneyProject.model;

import jakarta.persistence.*;

@Entity
@Table (name ="character_movie",uniqueConstraints = { @UniqueConstraint(columnNames = { "character_id", "movie_id" })})
public class CharacterMovie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long characterMovieId;

    @ManyToOne
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

}
