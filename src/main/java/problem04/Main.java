package problem04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	private static int N = 0;
	private static int S = 0;
	private static int B = 0;
	private static int O = 0;
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		int random = ran.nextInt(899)+100;
		System.out.println(random);
		
		List<Integer> list = new LinkedList<Integer>();
		list.add(random);
		
		String strran = String.valueOf(random);
		
		String[] strrans = strran.split("");
		String[] strusers;
		Scanner user = new Scanner(System.in);
		
		do {
			String struser = String.valueOf(user.nextInt());
			strusers = struser.split("");
		}
		while(!baseball(strrans, strusers));
		
		try {
		
		 BufferedWriter out = new BufferedWriter(new FileWriter("Baseball.txt"));
		 String s = null;
		 for(int i =0; i<list.size();i++) {
			 s = String.valueOf(list.get(i));
		 }
		 out.write(s); out.newLine();
		
		 out.close();
		
		} catch (IOException e) {
		   System.err.println(e);
		   System.exit(1);
		}
		
		
	}
	public static boolean baseball(String[] random, String[] user) {
		S = 0;
		B = 0;
		O = 0;
		
		for(int i=0; i<random.length;i++) {
			for(int j=0; j<user.length; j++) {
				if(random[i] == user[j]) {
					if(i==j) {
						S++;
					} else {
						B++;
					}
				} else {
					O++;
				}
			}
		}
		if(S==3) {
			return true;
		} else {
			System.out.println("S:"+S+"B:"+B+"O:"+ O);
			return false;
		}
	}
}



































