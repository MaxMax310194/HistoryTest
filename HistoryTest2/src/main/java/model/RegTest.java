package model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class RegTest {

	@NotEmpty
	@Size(max = 150)
	private String question;
	@NotEmpty
	@Size(max = 150)
	private String answer1;
	@NotEmpty
	@Size(max = 150)
	private String answer2;
	@NotEmpty
	@Size(max = 150)
	private String answer3;
	@NotEmpty
	@Size(max = 150)
	private String answer4;
	@NotEmpty
	@Size(max = 150)
	private String answer5;
	@NotEmpty
	private String correctAnswer;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer1() {
		return answer1;
	}
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	public String getAnswer2() {
		return answer2;
	}
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	public String getAnswer3() {
		return answer3;
	}
	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}
	public String getAnswer4() {
		return answer4;
	}
	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}
	public String getAnswer5() {
		return answer5;
	}
	public void setAnswer5(String answer5) {
		this.answer5 = answer5;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public RegTest() {
		super();
	}
	public RegTest(String question, String answer1, String answer2, String answer3, String answer4, String answer5,
			String correctAnswer) {
		super();
		this.question = question;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.answer5 = answer5;
		this.correctAnswer = correctAnswer;
	}
	
	
	
}
