import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

	public testSelectionSort() {
	}

	public void testPositive(){
		SelectionSort sorter = new SelectionSort();
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		
		sorter.basicSelectionSort(arr);
		assertArrayEquals(Sortedarr, arr);
	}

	public void testNegative(){
		SelectionSort sorter = new SelectionSort();
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = -8;
		Sortedarr[3] = -7;
		Sortedarr[4] = -2;
		
		sorter.basicSelectionSort(arr);
		assertArrayEquals(Sortedarr, arr);
	}

	public void testMixed(){
	/** Test data contains with both positive, negative and zeros **/
		SelectionSort sorter = new SelectionSort();
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = -10;
		arr[4] = 0;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -8;
		Sortedarr[2] = 0;
		Sortedarr[3] = 7;
		Sortedarr[4] = 9;
		
		sorter.basicSelectionSort(arr);
		assertArrayEquals(Sortedarr, arr);
	}

	public void testDuplicates(){
	/** Test data contains duplicates **/
		SelectionSort sorter = new SelectionSort();
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 8;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 7;
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -7;
		Sortedarr[1] = -7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 8;
		Sortedarr[4] = 10;
		
		sorter.basicSelectionSort(arr);
		assertArrayEquals(Sortedarr, arr);
	}
}