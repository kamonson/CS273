package helloWorld;

import java.util.Scanner;

public class helloWorld {

	public static void main(String[] args) {
		String name = "Zeus";
		System.out.printf("Hello %s what is your score?:", name);
		Scanner input = new Scanner (System.in);
		int score = input.nextInt();
		System.out.printf("Your scroe is %d\n", score);
		
		}

}
