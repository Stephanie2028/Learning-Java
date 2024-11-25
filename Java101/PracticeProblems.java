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

    public static int[] reverseArray (int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i=0; i < arr.length; i++) {
            newArray[i] = arr[arr.length - 1 - i];
            
        }
        return newArray; 

    }
    
    public static double sumGrid(double[][] grid){
        double sum = 0;

        for (int r= 0; r < grid.length; r++) {
            for (int c= 0; c < grid.length; c++ ) {
                sum = sum + grid[c][r];
            }
            
        }

        return sum;
    
    }


    public static int fib(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int x = 0;
        int y = 1;
        int nth = 0;

        for(int i = 2; i<n; i++){
            nth = x + y;
            y += x;
            x = nth; 

        }
        return nth;

        }
    }
