import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class BFF {
	public static String small="A-small-practice.in";
	public static String large ="C-large-practice.in";
	public static Scanner in;
	public static PrintStream ps;
	public static void main(String[] args) {
		init(large);
		int T = in.nextInt();
		for(int t=1;t<=T;t++){
			int N = in.nextInt();
			int [] F =new int [N];
			for(int i=0;i<N;i++)
			{
				F[i]= in.nextInt() -1;
			}
			
			// Count maximum Cycle
			int ans1 = 0;
			
			for(int i =0;i<N;i++)
			{
				int j=i;
				int count =0;
				boolean [] visited = new boolean[N];
				while(!visited[j])
				{
					visited[j] = true;
					j= F[j];
					count++;
				}
				if( j == i)
				{
					ans1 = Math.max(ans1, count);
				}
			}
			
			
			// Count the chain length
			
			int [] dep =new int[N];
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<N;j++)
				{
					if(F[F[j]]!= j)
					{
						dep[F[j]] = Math.max(dep[F[j]], dep[j]+1);
					}
				}
			}
			
			int ans2 = 0;
			for (int i : dep) {
				System.out.print(i+" ");
			}
			
			boolean [] visited =new boolean[N];
			for(int i=0;i<N;i++)
			{
				if(!visited[i] &&  F[F[i]]  == i)
				{
					System.out.println(i);
					System.out.println(F[i]);
					ans2 = ans2+2+ dep[i]+dep[F[i]];
					visited[i]  = true;
					visited[F[i]] = true;
				}
			}
			
			int ans =Math.max(ans1, ans2);
			System.out.println("Case #"+t+": "+ans);
			
		}
	}
	public static void init(String file){
		File input = new File(file);
		try {
			in = new Scanner(System.in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
