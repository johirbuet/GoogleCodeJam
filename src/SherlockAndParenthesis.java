import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class SherlockAndParenthesis {
	 public static void main(String[] args) throws FileNotFoundException {
			Scanner sc=new Scanner(new File("C-large-practice.in"));
			final PrintStream out=System.out;
			PrintStream ps=new PrintStream(new File("output.txt"));
			System.setOut(ps);
			int T= Integer.parseInt(sc.nextLine());
			for(int t=1;t<=T;t++)
			{
				String [] strs=sc.nextLine().split(" ");
				long n= Long.parseLong(strs[0]);
				long m=Long.parseLong(strs[1]);
				long min=Math.min(n, m);
				long r= min*(min+1)/2;
				System.out.println("Case #"+t+": "+r);
			}
		}
}
