package Sapient;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		//if 5 digit return 0, if non integer return 0, 
		//if negetive convert to positive, 
		//and in this or other cases reverse the number
		int num = 0;
		Scanner number = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		String strNum = number.nextLine();
		
		try{
			num = Integer.parseInt(strNum);
		}
		catch(NumberFormatException e){
			
			System.out.println("the interger entered \""+strNum+"\" is invalid");
		}
			int value = checkNum(num);
			System.out.println(" the value is "+value);
	}//end of main
	
	public static int checkNum(int num){
		//int num = 786;
		int mod = 0;
		int rev_num = 0;
		
		if(num>9999){
			return 0;
		}
		
		else if(num <0){
			num = num*-1;
		}
		
		try{
			int test = (Integer.valueOf(num));
		}
		catch(Exception e){
			System.out.println("it is not a valid integer");
		}
		
		while(num>0){
			
			mod = num%10;
			num = num/10;
			rev_num = mod +rev_num*10;
		}
		System.out.println("The reversed number is "+rev_num);
		return rev_num;
	}

}//end of class

