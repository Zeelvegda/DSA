//45. Write a program to convert infix notation to postfix notation using stack.


import java.util.Scanner;
import java.util.Stack;

public class ConvertInfiToPostfix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a infix");
        String infix=sc.next();
        MyStack s1=new MyStack();

      
        String polish="";
        int r=0;
        infix += ')';

        Stack<Character> stack = new Stack<>();
        stack.push('(');
        int i=0;
        char next;
            while(i < infix.length()){
                next=infix.charAt(i);

                while(s1.g(stack.peek())>s1.f(next)){
                    char temp=stack.pop();
                    polish=polish+temp;
                    r=r+s1.rank(temp);
                    if(r<1){
                        System.out.println("binvalid");
                    }
                }
                    if(s1.g(stack.peek())!=s1.f(next)){
                        stack.push(next);
                    }else{
                        stack.pop();
                    }
                    i++;
                    
            }

            if(!stack.isEmpty()|| r!=1){
                System.out.println("invalid");
            }else{
                System.out.println("valid");
                System.out.println(polish);
            }
    }
}
class MyStack{
    public int g(char c){
        if(c=='+'||c=='-'){
            return 2;
        }else if(c=='*'||c=='/'){
            return 4;
        }else if(c=='^'){
            return 5;
        }else if(c>='a' && c<='z'|| c>='A' && c<='Z'){
            return 8;
        }else if(c=='('){
            return 0;
        }else{
            System.out.println("no");
            return -1;
        }
    }
    public int f(char c){
        if(c=='+'||c=='-'){
            return 1;
        }else if(c=='*'||c=='/'){
            return 3;
        }else if(c=='^'){
            return 6;
        }else if(c>='a' && c<='z'|| c>='A' && c<='Z'){
            return 7;
        }else if(c=='('){
            return 9;
        }else if(c==')'){
            return 0;
        }else{
            System.out.println("no");
            return -1;
        }
    }
    public int rank(char c){
        if(c>='a' && c<='z'|| c>='A' && c<='Z'){
            return 1;
        }else if (c == '(' || c == ')'){
            return 0;
        }
        else
        {
            return -1;
        }
    }
}
}
