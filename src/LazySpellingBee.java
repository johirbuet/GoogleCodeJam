import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;

public class LazySpellingBee {
	public static long mod = 1000000007 ;
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("A-large-practice.in"));
		final PrintStream out=System.out;
		PrintStream ps=new PrintStream(new File("output.txt"));
		System.setOut(ps);
		int T= Integer.parseInt(sc.nextLine());
		for(int t=1;t<=T;t++)
		{
			String word= sc.nextLine();
			BigInteger bi = BigInteger.valueOf(1);
			char [] carr = word.toCharArray();
			for(int i = 0; i<carr.length;i++)
			{
				HashSet<Character> set =new HashSet<>();
				set.add(carr[i]);
				if(i<carr.length-1)
				{
					set.add(carr[i+1]);
				}
				if(i>0)
				{
					set.add(carr[i-1]);
				}
				int dif =set.size();
				bi = bi.multiply(BigInteger.valueOf(dif));
			}
			bi = bi.mod(BigInteger.valueOf(mod));
			System.out.println("Case #"+t+": "+""+bi.toString());
		}
		
		
	}
}
