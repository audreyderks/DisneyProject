package be.syntra.DisneyProject.model;

import jakarta.persistence.*;

@Entity
@Table (name ="favourite_character",uniqueConstraints = { @UniqueConstraint(columnNames = { "user_id", "character_id" })})
public class FavouriteCharacter {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long favouriteCharacterId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable=false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "character_id", nullable=false)
    private Character character;

    }
