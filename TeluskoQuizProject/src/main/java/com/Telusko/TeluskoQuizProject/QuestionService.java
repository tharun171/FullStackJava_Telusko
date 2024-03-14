package com.Telusko.TeluskoQuizProject;

import java.util.Scanner;

public class QuestionService {
	//listing questions in an array
		Question[] questionArray = new Question[5];
		//String[] for answers storing
		String[] userAnswersArray = new String[5]; 

		//hard coding questions
		public QuestionService()
		{
			questionArray[0] = new Question(1,"Whats java in CS",
					"food","program lang","nothing","all above",
					"program lang");
			questionArray[1] = new Question(2,"Whats java in CS",
					"food","program lang","nothing","all above",
					"program lang");
			questionArray[2] = new Question(3,"Whats java in CS",
					"food","program lang","nothing","all above",
					"program lang");
			questionArray[3] = new Question(4,"Whats java in CS",
					"food","program lang","nothing","all above",
					"program lang");
			questionArray[4] = new Question(5,"Whats java in CS",
					"food","program lang","nothing","all above",
					"program lang");
		}

		public void playQuiz()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("in quiz");
			int i=0;
			for(Question q:questionArray)
			{
				System.out.println(q.getId());
				System.out.println("Question: "+q.getId()+" "+q.getQuestion());
				System.out.println("option1 : "+q.getOpt1());
				System.out.println("option2 : "+q.getOpt2());
				System.out.println("option3 : "+q.getOpt3());
				System.out.println("option4 : "+q.getOpt4());
				System.out.println("--> Enter your answer not option: ");
				userAnswersArray[i] = sc.nextLine();
				i++;
			}
			//User entered Answers
			//for(String ans:userAnswersArray)
			//{
			//	System.out.println(ans);
			//}
			System.out.println("-------------------");
			System.out.println("Quiz Ended: ");
			int Score = calcScore();
			System.out.println("you got "+Score+"/5 correct");
			System.out.println("Thanks");
		}

		public int calcScore()
		{
			int correctAns = 0;
			for(int i=0;i<questionArray.length;i++)
			{
				if(questionArray[i].getAnswer().equals(userAnswersArray[i]))
					correctAns++;
			}
			return correctAns;
		}
}
