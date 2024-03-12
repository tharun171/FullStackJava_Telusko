package com.Telusko.TeluskoQuizProject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        QuestionService qs = new QuestionService();
		qs.playQuiz();
    }
}
