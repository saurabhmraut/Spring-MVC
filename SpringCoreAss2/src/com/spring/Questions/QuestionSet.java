package com.spring.Questions;

import java.util.Set;

public class QuestionSet {
	 	private int questionId1;
	    private String question1;
	    private  Set<String> answers1;    
	    
		public QuestionSet(int questionId1, String question1, Set<String> answers1) {
			super();
			this.questionId1 = questionId1;
			this.question1 = question1;
			this.answers1 = answers1;
		}
		
		public QuestionSet() {
			super();
		}

		public int getQuestionId1() {
			return questionId1;
		}
		public void setQuestionId1(int questionId1) {
			this.questionId1 = questionId1;
		}
		public String getQuestion1() {
			return question1;
		}
		public void setQuestion1(String question1) {
			this.question1 = question1;
		}
		public Set<String> getAnswers1() {
			return answers1;
		}
		public void setAnswers1(Set<String> answers1) {
			this.answers1 = answers1;
		}
	    
	    
}