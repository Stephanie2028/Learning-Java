package Java102;

import java.util.ArrayList;

public class Grid<T> {
	private final ArrayList<ArrayList<T>> grid;
	public final int sideLength;

	public Grid(int sideLength, T defaultVal) {
		this.sideLength = sideLength;
		this.grid = new ArrayList<ArrayList<T>>(sideLength);
		for (int i = 0; i < sideLength; i++) {
			grid.add(new ArrayList<>(sideLength));
			for (int j = 0; j < sideLength; j++) {
				grid.get(i).add(defaultVal);
			}
        
		}
// practice 4) Max Side Length  
        if (sideLength > maxSideLength) {
            sideLength = maxSideLength;
        }
	}

    private static int maxSideLength = 0;
   public static int maxSideLength(){
    return maxSideLength; 
   }

	public T get(int row, int col) {
		return grid.get(row).get(col);
	}

	public void set(int row, int col, T val) {
		grid.get(row).set(col, val);
	}

    // practice 3) Diagonal
    public ArrayList<T> diagonal(){
        ArrayList<T> diagonalElements = new ArrayList<>();

        for (int i = 0; i < sideLength; i++){
            diagonalElements.add(grid.get(i).get(i));

        }
        return diagonalElements; 
    }


	@Override
	public String toString() {
		String str = "";
		for (ArrayList<T> row : grid) {
			for (T element : row) {
				str += element + " ";
			}
			str += "\n";
		}
		return str;
	}
}