package rs.edu.code.SpringQuestionAndAnswerApp.model;

import javax.persistence.*;

@Entity
@Table(name = "answers")
public class Answer {

    @Id
    @GeneratedValue
    private long id;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String question_text;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String answer_text;

    @ManyToOne
    @JoinColumn(name = "question_id", foreignKey = @ForeignKey(name = "fk_question_id"))
    private Question question;

    public Answer() {

    }

    public Answer(String question_text, String answer_text) {
        this.question_text = question_text;
        this.answer_text = answer_text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion_text() {
        return question_text;
    }

    public void setQuestion_text(String question_text) {
        this.question_text = question_text;
    }

    public String getAnswer_text() {
        return answer_text;
    }

    public void setAnswer_text(String answer_text) {
        this.answer_text = answer_text;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
