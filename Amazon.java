package firstproject;

import java.util.Scanner;

public class Amazon {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Amazonprime[] ap = new Amazonprime[5];
		System.out.println("Enter details:");
		for(int i=0;i<2;i++) {
			int id=sc.nextInt();			
			String userName=sc.next();			
			int subPackage=sc.nextInt();			
			String showStreaming=sc.next();			
			int views=sc.nextInt();
			ap[i] = new Amazonprime(id,userName,subPackage,showStreaming,views);
		}
		int newid=sc.nextInt();
		int days=sc.nextInt();
		String show=sc.next();
		sc.close();
		
		int sol = methods.findRemainingDays(ap,newid,days);
		System.out.println(sol);
		methods.getDetails(ap,show);
		
		

	}
	

}
