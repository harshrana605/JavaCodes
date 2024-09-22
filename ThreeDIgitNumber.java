import java.util.Scanner ; 

public class ThreeDIgitNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = s.nextInt();
        if (num > 99 && num < 1000){
          System.out.println("Number is three digit number ");
        }
        else System.out.println("Number is not a three digit number");
        s.close();
    }}
