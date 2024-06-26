//Pascal Triangle
//      1
//     1 1
//    1 2 1
//   1 3 3 1
    
import java.util.Scanner;

public class Pascal
{
    public static void main(String[] args)
    {
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        rows = sc.nextInt();
                
        for (int i = 0; i < rows; i++)
        {
            int number = 1;
 
            for (int j = 0; j < rows - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

