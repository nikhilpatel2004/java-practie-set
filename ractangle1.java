
// import java.util.Scanner;

// public class ractangle1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int r =sc.nextInt();
//         int c = sc.nextInt();

//         for(int i = 1; i <= r; i++){
//             for(int j = 1; i<=c; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
    
// }
import java.util.Scanner;

public class ractangle1 {  // Class name should follow CamelCase convention
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows (height): ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns (width): ");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println();  // Newline after each row
        }

        System.out.println();  // Newline after the rectangle
    }
}
