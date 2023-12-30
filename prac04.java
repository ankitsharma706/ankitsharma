public class prac04 {
    static class test {
        // The print method remains the same as in the previous example
        void print(int arr[][]) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        // Corrected printSnake method to print in snake-like pattern
        void printSnake(int mat[][]) {
            int r = mat.length;
            int c = mat[0].length;

            for (int i = 0; i < r; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < c; j++) {
                        System.out.print(mat[i][j] + " ");
                    }
                } else {
                    for (int j = c - 1; j >= 0; j--) {
                        System.out.print(mat[i][j] + " ");
                    }
                }
                System.out.println(); // Move to the next line after each row
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 5 }, { 4, 5, 5, 6 }, { 8, 3, 4, 5 }, { 8, 9, 7, 5 } };
        test testObject = new test(); // Creating an instance of the test class
        testObject.print(arr); // Calling the print method using the instance
        testObject.printSnake(arr); // Calling the printSnake method using the instance
    }
}
