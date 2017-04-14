import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Dijkstra {
	public static String small="A-small-practice.in";
	public static String large ="B-large-practice.in";
	public static Scanner in;
	public static PrintStream ps;
	public static void main(String[] args) {
		init(large);
		int T=in.nextInt();
		for(int t=1;t<=T;t++)
		{
			String ans="";
			int L = in.nextInt();
			int k= in.nextInt();
			String w = in.next();
			String ins="";
			for(int i=0;i<k;i++){
				ins = ins+w;
			}
			int product = 1;
			char current=' ';
			for(int i=0;i<ins.length();i++)
			{
				current = ins.charAt(i);
				
			}
			System.out.println("Case #"+t+": "+ans);
		}
	}
	public static void init(String file){
		File input = new File(file);
		try {
			
			in =new Scanner(System.in);
			//in = new Scanner(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void initOut()
	{
		try {
			ps=new PrintStream(new File("output.txt"));
			System.setOut(ps);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
