package com.syntax.class04;

public class NestedIfContinues {

	public static void main(String[] args) {
		
		//check if patient has any allergies
		//if not allergies ---> you are healthy
		//otherwise check if patient has:
		//orange allergy -- do not eat oranges
		//apple allergy --> do not eat apples
		//kiwis allergy --> do not eat kiwis
	
	
		boolean allergy=true;
		boolean appleAllergy=false;
		boolean orangeAllergy=true;
		boolean kiwiAllergy=false;

 //declare date and a day. 
//if day is Friday --> if date is 13 --> watch a scary movie
//                  --> if date is not 13 --> watch a comedy

boolean isFriday=false;
int date=13;

if(isFriday) {
    System.out.println("Today is friday, I am going to a movies");
    
        if(date==13) {
            System.out.println("I'll watch scary movie");
            
        }else {
            System.out.println("I'll watch a comedy");
        }
    
}else {
    System.out.println("Today is not Friday, I am staying home");
}

	if(allergy) {
	
			System.out.println("Please answer below");
			if (orangeAllergy) {
				System.out.println("Do not eat oranges");
			}
		} else {
			System.out.println("Please answer below");
			
		}

	}

}
