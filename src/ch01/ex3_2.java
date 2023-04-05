package ch01;

import java.util.Scanner;

public class ex3_2 {

	public static void main(String[] args) {
		int i=5, j=0;
		
		j = i++;
		System.out.println("j=i++;, 실행 후, i="+i+", j="+j);
		
		i=5;
		j=0;
		System.out.println("j=++i;, 실행 후, i="+i+", j="+j);
		
	}

}
