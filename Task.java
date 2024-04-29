import java.util.*;
public class Task{
    void addTwoNumbers(int a, int b){
        System.out.println("the sum of "+a+"+"+b+"= "+ (a+b));
    }
    void minusTwoNumbers(int a, int b){
        System.out.println("the sum of "+a+"-"+b+"= "+ (a-b));
    }
    void multiplyTwoNumbers(int a, int b){
        System.out.println("the difference of  "+a+"*"+b+"= "+ (a*b));
    }
    void divideTwoNumbers(int a, int b){
        System.out.println("the sum of  "+a+"/"+b+"= "+ (a/b));
    }

    void arithMethod(int a,int b){
        addTwoNumbers(a, b);
        minusTwoNumbers(a, b);
        divideTwoNumbers(a, b);
        multiplyTwoNumbers(a, b);
    }


    public static void main(String[] args) {
        Task t7 = new Task();
        Scanner input = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int c = input.nextInt();
        int d = input.nextInt();
        t7.arithMethod(c, d);
        input.close();
        System.exit(0);
    }
    
}
