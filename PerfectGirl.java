import java.util.Scanner;

public class PerfectGirl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int totalSumEveryThing = 0;
		 while(input !="Enough dates!") { 
			String[] inputArray = input.split("\\\\");
			String day = inputArray[0];
			String telephoneNumber = inputArray[1];
			String sizesOfBra = inputArray[2];
			String girlname = inputArray[3];
			int digitFromDay = 0;
			
			switch(day) {
			case "Monday":
				digitFromDay = digitFromDay +1; 
				break;
			case "Thusday":
				digitFromDay = digitFromDay +2; 
				break;
			case "Wednesday":
				digitFromDay = digitFromDay +3; 
				break;
			case "Thirstday":
				digitFromDay = digitFromDay +4; 
				break;
			case "Friday":
				digitFromDay = digitFromDay +5; 
				break;
			case "Saturday":
				digitFromDay = digitFromDay +6; 
				break;
			case "Sunday":
				digitFromDay = digitFromDay +7; 
				break;
			default:
				break;
				
			}
			totalSumEveryThing = totalSumEveryThing + digitFromDay;
			
			int sumFromTelephoneNumber=0;
			// sum all numbers in telephone number
			int sumOfDigitsFromTElephone = 0;
			for(int i=0; i<telephoneNumber.length();i++) {
				char currentDigit = telephoneNumber.charAt(i);
				switch(currentDigit){
				case '0':
					sumOfDigitsFromTElephone = sumOfDigitsFromTElephone+0;
					break;
				case '1':
					sumOfDigitsFromTElephone = sumOfDigitsFromTElephone+1;
					break;
				case '2':
					sumOfDigitsFromTElephone = sumOfDigitsFromTElephone+2;
					break;
				case '3':
					sumOfDigitsFromTElephone = sumOfDigitsFromTElephone+3;
					break;
				case '4':
					sumOfDigitsFromTElephone = sumOfDigitsFromTElephone+4;
					break;
				case '5':
					sumOfDigitsFromTElephone = sumOfDigitsFromTElephone+5;
					break;
				case '6':
					sumOfDigitsFromTElephone = sumOfDigitsFromTElephone+6;
					break;
				case '7':
					sumOfDigitsFromTElephone = sumOfDigitsFromTElephone+7;
					break;
				case '8':
					sumOfDigitsFromTElephone = sumOfDigitsFromTElephone+8;
					break;
				case '9':
					sumOfDigitsFromTElephone = sumOfDigitsFromTElephone+9;
					break;
					
				
				}
				System.out.printf("sum of telephone %d\n", sumOfDigitsFromTElephone);
			}
			// 2 checkpoint
			totalSumEveryThing = totalSumEveryThing+ sumOfDigitsFromTElephone;
			
			//braSize calculation 85C,110C
			int lastIndex = sizesOfBra.length()-1;
			char letterLastIndex = sizesOfBra.charAt(lastIndex);
			int asciicodeletterLastIndex = (int)letterLastIndex;
			System.out.printf("ascii code letter is %d\n", asciicodeletterLastIndex);
			int bradigits = Integer.parseInt(sizesOfBra.substring(0, sizesOfBra.length()-1));
			int multyplybradigitsbyasciicodeletterLastIndex = asciicodeletterLastIndex*bradigits;
			
			totalSumEveryThing = totalSumEveryThing+multyplybradigitsbyasciicodeletterLastIndex;
			
			//girl name calculations
			char firstLettergirlName = girlname.charAt(0);
			int asciicodefirstLettergirlName = (int)firstLettergirlName;
			System.out.printf("ascii code firstlettergirlname is %d\n", asciicodefirstLettergirlName);
			int rezultFromGirlName = asciicodefirstLettergirlName*(girlname.length());
			//shall substract this from total sum
			totalSumEveryThing = totalSumEveryThing - rezultFromGirlName;
			
			//print totalSumEveryThing
			System.out.printf("totalsum of everything is: %d", totalSumEveryThing);
			if(totalSumEveryThing >= 6000) {
				System.out.printf("%s is perfect for you.\n",girlname );

			} else {
				//“Keep searching, [name] is not for you.” 
				System.out.printf("Keep searching, %s is not for you.\n",girlname );
				
			}
			
			input = scanner.nextLine(); }

	}

}
