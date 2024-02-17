package be.syntra.DisneyProject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long questionId;

    @Column(name = "question", unique = true)
    private String question;

    @ManyToOne
    @JoinColumn(name = "answerA", nullable = false)
    private Character characterA;

    @ManyToOne
    @JoinColumn(name = "answerB", nullable = false)
    private Character characterB;

    @ManyToOne
    @JoinColumn(name = "answerC", nullable = false)
    private Character characterC;

    @ManyToOne
    @JoinColumn(name = "correctAnswer", nullable = false)
    private Character correctAnswer;
}
