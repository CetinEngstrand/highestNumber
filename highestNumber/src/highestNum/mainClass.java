package highestNum;
import java.util.Scanner;

public class mainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers will you like to add?:");
		int x = input.nextInt();
		
		int nums[] = new int[x];
		int i = 0;
		while(i<nums.length){
			int counter = i+1;
			System.out.println("Add a number: ("+counter+"/"+nums.length+")");
			nums[i]= input.nextInt();
			System.out.println(highestNumber(nums));
			i++;
		}
	}
	
	public static String highestNumber(int numbers[]){
		int highest = numbers[0]; // optimate.
		for(int i=1; i<numbers.length; i++){
			
			if(numbers[i]>highest){
				highest = numbers[i];
			}
		}
		
		return "The highest number is "+highest+".";
	}
}