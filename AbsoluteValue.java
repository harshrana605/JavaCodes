import java.util.Scanner ; 

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = s.nextInt();
        if (num<0) {
            System.out.println(num = num*(-1)); }
        else{
        System.out.println(num);    } 
        s.close(); 
        
    }
} 