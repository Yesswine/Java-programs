import java.io.*;
import java.util.*;
public class Arrpos {
	public static int findIndex(int arr[], int t)
	{
		if (arr == null) {
			return -1;
		}
		int len = arr.length;
		int i = 0;

		while (i < len) {
			if (arr[i] == t) {
				return i;
			}
			else {
				i = i + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[]ar = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };

		System.out.println("position of the elements"
						+ findIndex(ar, 4));

	}
}
