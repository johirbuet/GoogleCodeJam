import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CountyLeader {

	public static void main(String[] args) throws FileNotFoundException {
		//new File("A-large-practice.in")
		Scanner sc = new Scanner(new File("A-large-practice.in")); 
		final PrintStream out=System.out;
		PrintStream ps=new PrintStream(new File("output.txt"));
		System.setOut(ps);
		int T=Integer.parseInt(sc.nextLine());
		for(int t=1;t<=T;t++)
		{
			int n=Integer.parseInt(sc.nextLine());
			PriorityQueue<String> pq=new PriorityQueue<String>(n, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					HashSet<Character> set1=new HashSet<>();
					HashSet<Character> set2=new HashSet<>();
					char [] ch1 = o1.toCharArray();
					char [] ch2 = o2.toCharArray();
					for(char c: ch1)
					{
						if(c==' ')
						{
							continue;
						}
						set1.add(c);
					}
						
					for(char c: ch2)
					{
						if(c==' ')
						{
							continue;
						}
						set2.add(c);
					}
						
					if(set1.size()==set2.size())
					{
						return o1.compareTo(o2);
					}
					else if(set1.size()<set2.size())
						return 1;
					else
						return -1;
				}
			});
			
			for(int i=0;i<n;i++)
			{
				String name = sc.nextLine();
				pq.add(name);
			}
			System.out.println("Case #"+t+": "+pq.poll());
		}
		sc.close();
	}

}
