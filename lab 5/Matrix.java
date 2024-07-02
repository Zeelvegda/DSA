import java.util.Scanner;
public class Matrix{
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                
                int array1 [][]=new int[2][2];
                System.out.println("Enter an array ofFirst matrix 1");
                    
                for(int i=0;i<2;i++){
                    for(int j=0;j<2;j++){
                        array1  [i][j]=sc.nextInt();
                    }
                }
                
                int array2 [][]=new int[2][2];
                System.out.println("Enter an array of second matrix 2");
                for(int i=0;i<2;i++){
                    for(int j=0;j<2;j++){
                        array2 [i][j]=sc.nextInt();
                    }
                }
                int sum[][]=new int[2][2];
                for(int i=0;i<2;i++){
                    for(int j=0;j<2;j++){
                       sum[i][j]= array1 [i][j]+ array2 [i][j];
                    }
                }
                for(int i=0;i<2;i++){
                    for(int j=0;j<2;j++){
                System.out.println(sum[i][j]);
                
                    }
                    }
            }







}
       