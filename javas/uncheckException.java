import java.util.*;
public class uncheckException{
	public static void main(String[] args){
		int arr[] = {1,2,3,4,5};
		try{
			System.out.println(arr[7]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of bound");

		}
	}
}
