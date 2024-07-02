import java.util.Scanner;
public class MultiplicationMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  int r1=sc.nextInt();
        //  int c2=sc.nextInt();
        //  int c1=sc.nextInt();
        //  int r2=c1;
        
        int array1 [][]=new int[3][2];
        System.out.println("Enter an array ofFirst matrix 1");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                array1  [i][j]=sc.nextInt();
            }
        }
        
        int array2 [][]=new int[2][3];
        System.out.println("Enter an array of second matrix 2");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                array2 [i][j]=sc.nextInt();
            }
        }
        int ans[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                ans[i][j]=0;
                for(int k=0;k<2;k++){
                    ans[i][j]+=array1[i][k]*array2[k][j];

                }
               
            }
        }
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
            System.out.println(ans[i][j]);
                }
            }





    }
}
