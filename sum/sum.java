import java.io.*;

class sum{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a ,b , sum=0;
        System.out.println("Enter the numbers:\n");
        a = in.nextInt();
        b = in.nextInt();
        sum = a+b;
        System.out.println("sum="+sum);
    }
}