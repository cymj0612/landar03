package Java2;

public class J074Sort {
	public static void main(String[] args) {  
        int[] array = { -6, 5, 10, 30, -9, 25, 6, 9, 18 };   
        quickSort(array, 0, array.length - 1);  
        for (int i = 0; i < array.length; i++) {  
            System.out.print(array[i]+" ");
        }
	}
    public static void swap(int[] array, int i, int j) {  
        if (i == j) {  
            return;  
        }  
        array[i] = array[i] + array[j];  
        array[j] = array[i] - array[j];  
        array[i] = array[i] - array[j];  
    }  
  
    public static void quickSort(int[] array, int start, int end) {  
        if (start >= end)  
            return;  
        //以起始索引为分界点  
        int temp = array[start];  
        int i = start + 1;  
        int j = end;  
        while (true) {  
            while (i <= end && array[i] < temp) {  
                i++;  
            }  
            while (j > start && array[j] > temp) {  
                j--;  
            }  
            if (i < j) {  
                swap(array, i, j);  
            } else {  
                break;  
            }  
        }  
        //交换 j和分界点的值  
        swap(array, start, j);  
        //递归左子序列  
        quickSort(array, start, j - 1);  
        //递归右子序列  
        quickSort(array, j + 1, end);  
    }  
}

	 