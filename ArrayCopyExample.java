package exam_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		//1. dPwp
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0,oldStrArray.length);
		
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0,oldStrArray.length);
			
			for(int i = 0; i<newStrArray.length; i++) {
				System.out.println(newStrArray[i]);
			if(i<newStrArray.length-1)
				System.out.println(", ");
		};
		
		//2.예제
		int myArray[] = {100, 200, 300, 400, 500 };
		int array[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		System.out.println("<==myArray의 배열 값==>");
		for (int i = 0; i <myArray.length; i++) {
			System.out.println(myArray[i] + " ");
			
		}
		System.out.println();
		
		System.out.println("<==array의 배열 값==>");
		for (int j = 0; j <myArray.length; j++) {
			System.out.println(myArray[j] + " ");
		}
		System.out.println();
		System.arraycopy(myArray, 0, array, 0, myArray.length);
		
		System.out.println("<==myArray의 배열 값==>");
		for (int j = 0; j <myArray.length; j++) {
			System.out.println(myArray[j] + " ");
		}
	}

}
