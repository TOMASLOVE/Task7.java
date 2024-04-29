import java.util.*;
public class Task{
    void addTwoNumbers(int a, int b){
        System.out.println("the sum of "+c+"+"+d+"= "+ (c+d));
    }
    void minusTwoNumbers(int c, int d){
        System.out.println("the sum of "+c+"-"+d+"= "- (c-d));
    }
    void multiplyTwoNumbers(int c, int d){
        System.out.println("the difference of  "+c+"*"+d+"= "* (c*d));
    }
    void divideTwoNumbers(int c, int d){
        System.out.println("the sum of  "+c+"/"+d+"= "/ (a/b));
    }

    void arithMethod(int c,int d){
       t.addTwoNumbers(c, d);
        t.minusTwoNumbers(c, d);
        t.divideTwoNumbers(c, d);
        t.multiplyTwoNumbers(c, d);
    }


    public static void main(String[] args) {
        Task t = new Task();
        Scanner input = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int c = input.nextInt();
        int d = input.nextInt();
        t.arithMethod(c, d);
        input.close();
        System.exit(status:0);
    }
    
}
