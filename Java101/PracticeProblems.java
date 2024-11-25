package Java101;

public class PracticeProblems {
    static int[] arr = {1, 3, 4, 3, 6, 7};
    static int n = 3;

	public static int countOccurences (int n, int[] arr) {
       int count= 0; 
       for (int i=0; i < arr.length; i++) {
        if (arr[i] == n) {
            count++;
        }
       }
       return count; 
	}
}