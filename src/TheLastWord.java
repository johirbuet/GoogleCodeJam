import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TheLastWord {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc =new Scanner(new File("A-large-practice.in"));
		PrintStream ps =new PrintStream(new File("output.txt"));
		System.setOut(ps);
		int T= Integer.parseInt(sc.nextLine());
		for(int t = 1; t<=T;t++)
		{
			String word = sc.nextLine();
			String res= "";
			for(int i =0 ;i<word.length();i++){
				if((res+word.charAt(i)).compareTo(word.charAt(i)+res) >=0)
				{
					res =res +word.charAt(i);
				}
				else
				{
					res = word.charAt(i)+ res;
				}
			}
			System.out.println("Case #"+t+": "+res);
		}
		sc.close();
	}
}
