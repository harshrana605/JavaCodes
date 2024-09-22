import java.util.Scanner ;
public class Recursion {
                                                         
    public static void main(String[] args) {       // simple Recursion 
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        long fact = factorial(num); 
        input.close();
        System.out.println("value of factorial : " + fact);
    }
    public static int factorial(int number) {
        System.out.println("Function called for : " + number);    
        if(number==1){
        return 1 ;
    }
        else {
        return number * factorial(number - 1) ;}
    }

    
}
