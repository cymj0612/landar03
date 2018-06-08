package Java2;

public class J073_Sort {
  public static void main(String[] args) {
	  int[] array= {-6, 5, 10, 30, -9, 25, 6, 9, 18};
	  insertionSort(array);
	  for(int i=0;i<array.length;i++) {
		  System.out.print(array[i]+" ");
	  }
  }

  public static void insertionSort(int[] array) {
	  for(int i=1;i<array.length;i++) {
		  for(int j=i;(j>0 && array[j] < array[j-1]);j--) {
			  int temp = array[j];
			  array[j] = array[j-1];
			  array[j-1] = temp;
		  }
	  }
  }
}