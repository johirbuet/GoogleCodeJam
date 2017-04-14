import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class InfiniteHouseOfPanCakes {

	public static String small="A-small-practice.in";
	public static String large ="B-large-practice.in";
	public static Scanner in;
	public static PrintStream ps;
	public static void main(String[] args) throws FileNotFoundException {
		init(large);
		PrintStream ps1 =new PrintStream(new File("output.txt"));
		System.setOut(ps1);
		int T=in.nextInt();
		for(int t=1;t<=T;t++){
			int n = in.nextInt();
			int max = 0;
			int [] Ps=new int[n];
			for(int i = 0;i<n;i++){
				int p = in.nextInt();
				Ps[i] = p;
				max= Math.max(p, max);				
			}
			
			int total =0;
			int ans = max;
			for(int x =1;x<max;x++)
			{
				total = 0;
				for(int i=0;i<n;i++)
				{
					total =total + (Ps[i] -1)/x;
				}
				ans = Math.min(ans, total+x);
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
