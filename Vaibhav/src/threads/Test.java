package threads;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Packageforthreads pt=new Packageforthreads();
	pt.start();
	 System.out.println("press enter to stop thread");
	Scanner sc=new Scanner(System.in);
	sc.nextLine();
	
	pt.shutDown();
	System.out.println("Thread is stop");
}
}
