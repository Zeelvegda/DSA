// 47. Write a program for evaluation of postfix Expression using Stack.
import java.util.*;
import java.util.Stack;

public class EvaluationPost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter postfix");
        String postfix_exp=sc.next();
        Stack<Double> stack=new Stack<>(); //<> = inbuilt function
        int i=postfix_exp.length()-1;
        double opr1;
        double opr2;
        double temp;
        while(i>=0){
            char ch=postfix_exp.charAt(i);
            if(Character.isDigit(ch)){
                stack.push((double)ch-'0');
               
            }else{
                opr2=stack.pop();
                opr1=stack.pop();

                switch(ch){
                    case '+':temp=opr1+opr2;
                            stack.push(temp);
                            break;
                    case '-':temp=opr1-opr2;
                            stack.push(temp);
                            break; 
                    case '*':temp=opr1*opr2;
                            stack.push(temp);
                            break; 
                    case '/':temp=opr1/opr2;
                            stack.push(temp);
                            break;
                    case '^':temp=(Math.pow(opr1,opr2));
                            stack.push(temp);
                            break;

                    default:break;        
           
                }
            }
            i--;
        }
        double ans=stack.pop();
        System.out.println("ans"+(ans));
    }
}