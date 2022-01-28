package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Collections;


public class Application {
public static void main(String[] args) {
	
	
	
	
	Integer[] array12 = {23,5,7,98543,423,5,67,1,54,79,3,56,32};
	System.out.println("Before sorting");
	System.out.println(Arrays.toString(array12));
	Arrays.sort(array12);
	System.out.println("After sorting asc");
	System.out.println(Arrays.toString(array12));
	Arrays.sort(array12, Collections.reverseOrder());
	System.out.println("After sorting desc");
	System.out.println(Arrays.toString(array12));
	
	

	
}
	
}




