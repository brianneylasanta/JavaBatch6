package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		//arrays are fixed in size
		
		String[] students= new String[3];
		students[0]="Hassna";  //please make sure to store 3 elements instead of four like seen here.
		students[1]="Faisal";
		students[2]="Kemal";
		//students[3]="Aaron"; -----> during run time java machine will give "java.lang.ArrayIndexOutOfBoundsException"
		
		//System.out.println(students[3]);
		
		String[] inClassStudents=new String[5];
		inClassStudents[1]="Hichem";
		inClassStudents[2]="Tetteh";
		inClassStudents[3]="Bobby";
		inClassStudents[4]="Christina";
		//inClassStudents[5]="Hichem"; --> array will get out of bound exception again! We must start at 0.
		
		//if we store less elements than we declared compiler will add default values "null"  if we dont start at 0!
		
		System.out.println(inClassStudents[0]);

	}

}
