import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class LastWord {

	public static Scanner in;
	public static String outputFileName ="data/output.txt";
	public static PrintStream ps;
	public static String input ="data/A-large.in"; 
	public static boolean submit = true;
	public static void main(String[] args) {
		in =new Scanner(System.in);
		if(submit)
		{
			init();
		}
		int T = Integer.parseInt(in.nextLine());
		for(int i=1;i<=T;i++)
		{
			String w = in.nextLine();
			char [] crr = w.toCharArray();
			String res ="";
			for(int j=0;j<crr.length;j++)
			{
				if((crr[j]+res).compareTo(res+crr[j])<=0)
				{
					res = res +crr[j];
				}
				else
				{
					res = crr[j]+res;
				}
			}
			System.out.println("Case #"+i+": "+res);
		}
	}
	public static void init()
	{
		try {
			in = new Scanner(new File(input));
			ps =new PrintStream(new File(outputFileName));
			System.setOut(ps);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
