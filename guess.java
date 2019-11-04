import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class guess {
	public static void main(String[]args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("guess.in"));
		PrintWriter pw = new PrintWriter(new File("guess.out"));
		//Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Set<String>> animals = new ArrayList<Set<String>>();
        //Set<String> total = new HashSet<String>(); 
		for(int i = 0; i<n ; i++) {
			String[] s = sc.nextLine().split(" ");
			int nn = Integer.parseInt(s[1]);
	        Set<String> ss = new HashSet<String>(); 
			for(int j = 0; j<nn; j++) {
				//total.add(s[2+j]);
				ss.add(s[2+j]);
			}
			animals.add(ss);
		}
		//System.out.println(animals);
		//System.out.println(total);
		int maxlength = 0;
		for(int i = 0; i<n; i++) {
	        Set<String> total = new HashSet<String>(); 
			for(int j = 0; j<n; j++) {
				if(i!=j) {
					total.addAll(animals.get(j));
				}
			}
			//System.out.println(total);
			Set<String> intersection = new HashSet<String>(total); // use the copy constructor
			intersection.retainAll(animals.get(i));
			//System.out.println(intersection);
			if(maxlength<intersection.size()) {
				maxlength = intersection.size();
			}
		}
		if(maxlength != 0) {
			//System.out.println(maxlength+1);
			pw.println(maxlength+1);
		}
		else {
			int maxlen = 0;
			for(int i = 0; i<n; i++) {
				int len = animals.get(i).size();
				if(len>maxlen) {
					maxlen = len;
				}
			}
			//System.out.println(maxlen+1);
			pw.println(maxlen+1);
		}
		
		pw.close();
	}

}
