import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class StandingOvation {

	public static String small="A-small-practice.in";
	public static String large ="A-large-practice.in";
	public static Scanner in;
	public static PrintStream ps;
	public static void main(String[] args) throws FileNotFoundException {
		init(large);
		PrintStream ps1 =new PrintStream(new File("output.txt"));
		System.setOut(ps1);
		int T= in.nextInt();

		for(int t=1;t<=T;t++)
		{
			int ans = 0;
			int n= in.nextInt();
			int presonsfound = 0;
			String s =in.next();
			char [] car = s.toCharArray();
			for(int i=0;i<=n;i++)
			{
				int person = Integer.parseInt(car[i]+"");
				if(i>presonsfound)
				{
					ans += i-presonsfound;
					presonsfound= presonsfound +(i-presonsfound);
				}
				presonsfound+=person;
			}
			System.out.println("Case #"+t+": "+ans);
		}
	}
	public static void init(String file){
		File input = new File(file);
		try {
			in = new Scanner(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
