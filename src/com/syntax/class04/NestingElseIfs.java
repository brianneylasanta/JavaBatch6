package com.syntax.class04;

public class NestingElseIfs {

	public static void main(String[] args) {
		//if student completed a quiz we will check for a score
		// if scored >90 --> great job
		//if scored > 80 ---> well done
		//if scored > 70 --> you could have done better
		//
		//if student did not complete the quiz --> not good
		// please do homework on time 
		
		boolean quizCompleted=false;
		int score=86;
		
		if(quizCompleted) {
			System.out.println("Lets check your score");
			if(score>90) {
				System.out.println("Great Job, you study alot");
			}else if(score>80) {
				System.out.println("Well done");
			}else if(score>70) {
				System.out.println("You could have done better");
			}else {
				System.out.println("You failed");
			}
		}else {
			System.out.println("Please do HW on time");
			
		
		}

	}

}
