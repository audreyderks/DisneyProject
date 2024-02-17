package be.syntra.DisneyProject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "disney_character")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long characterId;

    @Column (name = "character_name", unique = true, nullable = false)
    private String characterName;

    @Column (name = "image_url", unique = true)
    private String imageUrl;

    @Column (name = "description")
    private String characterDescription;
}
