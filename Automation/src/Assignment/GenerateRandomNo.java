package Assignment;

import java.util.Random;

public class GenerateRandomNo {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		System.out.println(r.nextInt(10000));
	}

}
