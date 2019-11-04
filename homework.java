import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class homework {
	public static void main(String[]args) throws IOException{
		//Scanner sc = new Scanner(new File("homework.in"));
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] aa = sc.nextLine().split(" ");
		int[] a = new int[n];
		for(int i = 0; i<n; i++) {
			a[i] = Integer.parseInt(aa[i]);
		}
		int[] dp = new int[n+1];
		for(int i = 0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		for(int i = n; i>=0; i--) {
			
		}
		
		
		
		
		
	}
}
