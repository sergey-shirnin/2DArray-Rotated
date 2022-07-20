import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] arrSource = new int[rows][cols];
        int[][] arr90DegreeRight = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arrSource[i][j] = scanner.nextInt();
            }
        } 
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                arr90DegreeRight[i][j] = arrSource[rows - 1 - j][i];
            }
        }
        for (int[] row : arr90DegreeRight) {
            System.out.println(String.join(" ", 
                                           Arrays.stream(row)
                                                .mapToObj(String::valueOf)
                                                .toArray(String[]::new)));
        }
    }
}
