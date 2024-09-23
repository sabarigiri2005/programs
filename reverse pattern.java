import java.util.Scanner;

public class RightTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the right triangle: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++)
        {
            for(int k=rows-i;k>0;k--)
            {
                System.out.print("  ");
            }
  
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println( );
        }

        scanner.close();
    }
}
