package For_Loop;

import java.util.Iterator;

public class Loop {
	public static void main(String[] args) {
		int i,j;
//	for ( i = 1; i <=3; i++) {
//		System.out.print(i+ " ");
//	}

		 for (i = 1; i <= 3; i++) {
			for (j = 3; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
