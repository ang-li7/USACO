import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class shell {
	public static void main(String[]args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("shell.in"));
		PrintWriter pw = new PrintWriter(new File("shell.out"));
		//Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine()); 
		int x = 0; 
		int y = 0; 
		int z = 0; 
		int[] a = {1, 2, 3};
		for(int i = 0; i<n; i++) {
			String[] ll = sc.nextLine().split(" "); 
			int[] l = new int[3];
			for (int j = 0; j<3; j++){
				l[j] = Integer.parseInt(ll[j]);
			}
			//swap
			int indexa = l[0] -1; 
			int indexb = l[1] - 1;
			int temp = a[indexb];
			a[indexb] = a[indexa];
			a[indexa] = temp;
			//choose
			int shell = a[l[2]-1];
			//System.out.println(shell);
			if(shell == 1) {
				x++;
			}
			else if(shell == 2) {
				y ++;
			}
			else {
				z ++;
			}
			
		}
		if (x > y && x > z)
			//System.out.println(x);
        	pw.println(x);
		else if (y > x && y > z)
		    //System.out.println(y);
    		pw.println(y);
		else
			//System.out.println(z);
			pw.println(z);
		pw.close();
		
	}
	

}
