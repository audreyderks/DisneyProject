package be.syntra.DisneyProject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "character")
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

    public long getCharacterId() {
        return characterId;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCharacterDescription() {
        return characterDescription;
    }

    public void setCharacterDescription(String characterDescription) {
        this.characterDescription = characterDescription;
    }
}
