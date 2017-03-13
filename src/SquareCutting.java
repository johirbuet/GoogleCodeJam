import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class SquareCutting {
	private static long MOD = 1000000007;
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("A-large-practice.in"));
		final PrintStream out=System.out;
		PrintStream ps=new PrintStream(new File("output.txt"));
		System.setOut(ps);
		int T= Integer.parseInt(sc.nextLine());
		for(int t=1;t<=T;t++)
		{
			String [] strs=sc.nextLine().split(" ");
			double r =Double.parseDouble(strs[0]);
			double c= Double.parseDouble(strs[1]);
			BigInteger b1=new BigInteger(strs[0]);
			BigInteger b2 = new BigInteger(strs[1]);
			double min =Math.min(r, c);
			double max= Math.max(r, c);
			double ans = 0;
			BigInteger bmin = b1.min(b2);
			BigInteger bmax=b1.max(b2);
			BigInteger bans=bmin.subtract(BigInteger.ONE).multiply(bmin).multiply(bmin.add(BigInteger.ONE))
					.multiply(bmax.multiply(BigInteger.ONE.add(BigInteger.ONE)).subtract(bmin)).divide(BigInteger.valueOf(12));
			bans=bans.mod(BigInteger.valueOf(MOD));
			// This is the formula 
			
			ans=(min-1)*min*(min+1)*(2*max-min)/12;
			
			System.out.println("Case #"+t+": "+bans.toString());
		}
		
		sc.close();
	}
}
