import java.util.Scanner ; 

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = s.nextInt(); 
        if (num % 2 == 0){
            System.out.println("Even number"); } 
        else if (num % 2 != 0) {
            System.out.println("odd number ");
        }


        //divisible by 5 or 3 
        System.out.print("Enter your number : "); 
        int num4 = s.nextInt();
        if(num4 % 5 == 0){
            if (num4 % 3 == 0) {
                System.out.println("Number is divisible by 5 and 3");} 
            else { System.out.println("Number not divisible by 5 or 3 ");}
            }
        System.out.println("Number not divisible by 5 or 3 ");
        
         

        // divisible by 5 or 3 but not 15

        System.out.print("Enter your number : "); 
        int num5 = s.nextInt();
        if((num5 % 5 ==0 || num5 % 3==0) && num%15 != 0){
            System.out.println("divisible by 5 or 3 but not 15");
        }

        // ternary operator 
        int number = 7; // Change this number to test

        String result = (number % 2 == 0) ? "even" : "odd"; 

        System.out.println("The number " + number + " is " + result + ".");
    
    

        
        
        
        s.close();

    }
}
