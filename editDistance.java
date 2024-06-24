import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int m = 3; // number of rows
        int n = 4; // number of columns
        int initialValue = 0; // initial value for each element

        // Create the outer ArrayList
        ArrayList<ArrayList<Integer>> arrayList2D = new ArrayList<>(m);

        // Initialize each row and add to the outer ArrayList
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> row = new ArrayList<>(n);
            for (int j = 0; j < n; j++) {
                row.add(initialValue);
            }
            arrayList2D.add(row);
        }

        // Print the 2D ArrayList to verify the initialization
        for (ArrayList<Integer> row : arrayList2D) {
            System.out.println(row);
        }
    }
}
