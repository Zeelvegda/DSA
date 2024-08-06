//48. Write a program for evaluation of prefix Expression using Stack

import java.util.*;
import java.util.Stack;

public class EvaluationPrifix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter prefix");
        String prefix_exp=sc.next();
        Stack<Double> stack=new Stack<>(); //<> = inbuilt function
        int i=prefix_exp.length()-1;
        double opr1;
        double opr2;
        double temp;
        while(i>=0){
            char ch=prefix_exp.charAt(i);
            if(Character.isDigit(ch)){
                stack.push((double)ch-'0');
               
            }else{
                opr1=stack.pop();
                opr2=stack.pop();

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



