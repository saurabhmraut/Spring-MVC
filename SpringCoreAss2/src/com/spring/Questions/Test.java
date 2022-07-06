package com.spring.Questions;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String args[]) {
	
ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

Question ques=(Question) context.getBean("questions");
System.out.println("list");
System.out.println(ques.getQuestionId());
System.out.println(ques.getQuestion());
System.out.println(ques.getAnswers());
System.out.println("--------------------------------------------------------------------------");
QuestionSet ques1=(QuestionSet) context.getBean("questions1");
System.out.println("Set");
System.out.println(ques1.getQuestionId1());
System.out.println(ques1.getQuestion1());
System.out.println(ques1.getAnswers1());
System.out.println("--------------------------------------------------------------------------");
QuestionMap ques2=(QuestionMap) context.getBean("questions2");
System.out.println("map");
System.out.println(ques2.getQuestionId2());
System.out.println(ques2.getQuestion2());
System.out.println(ques2.getAnswers2());
System.out.println("--------------------------------------------------------------------------");

context.close();
}
}
