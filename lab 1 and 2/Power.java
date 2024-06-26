import java.util.Scanner;
 
public class Power{
    public static void main(String[] args) {
        int result=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base no.");
        int base=sc.nextInt();
        System.out.println("Enter the exponent no.");
        int exponent=sc.nextInt();
        for(int i=0;i<=exponent;i++){
            result*=base;
        }
        System.out.println("power"+result);
        
       
    }
}