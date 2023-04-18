package first;

import java.util.Scanner;

public class ex3_17 {
	public static void main(String[] args) {
	
		int x, y, z; // 정수
		int absX, absY, absZ; // 정수
		char signX, signY, signZ;  // 문자열
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x : -x; // absX = x
		absY = y >= 0 ? y : -y; // absY = -y
		absZ = z >= 0? z : -z;  // absZ =  z
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-'); // +
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-'); // -
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-'); // -
		
		System.out.printf("x=%c%d%n", signX, absX); // '+' 10
		System.out.printf("y=%c%d%n", signY, absY); // '-' -5
		System.out.printf("z=%c%d%n", signZ, absZ); // '-' 0
		
	}
}


