import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
/**
 * 
 * public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T= Integer.parseInt(sc.nextLine());
		for(int t=1;t<=T;t++)
		{
			System.out.println("Case #"+t+": "+"");
		}
	}
 *
 */
public class Vote {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("B-small-practice.in"));
		final PrintStream out=System.out;
		PrintStream ps=new PrintStream(new File("output.txt"));
		System.setOut(ps);
		int T= Integer.parseInt(sc.nextLine());
		for(int t=1;t<=T;t++)
		{
			String [] strs=sc.nextLine().split(" ");
			double n= Double.parseDouble(strs[0]);
			double m=Double.parseDouble(strs[1]);
			double num= n-m;
			double den=n+m;
			double p = num/den;
			System.out.printf("Case #%d: %.8f\n", t,p);
		}
		sc.close();
	}
}
