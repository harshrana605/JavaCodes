import java.util.Scanner ; 
public class Greatestof3numbers {
   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number 1 : ");
        int num1 = s.nextInt();
        System.out.println("Enter your number 2 : ");
        int num2 = s.nextInt();
        System.out.println("Enter your number 3 : ");
        int num3 = s.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("Greatest number is : " + num1);}
        else if (num2 > num1 && num2 > num3){
            System.out.println("Greatest number is : " + num2);}
        else {
             System.out.println("Greatest numbers is : " + num3);}

        
        if(num1 > num2){       // another method 
            if(num1 > num3){
                System.out.println("greatest number is : " + num1);}
            else {System.out.println("Greatest is : " + num3);} }
        else {
            if (num2> num3) {
                System.out.println("greatest number is : " + num2);
            }
            else { System.out.println("gretsest is : " + num3);}
        }
            
        
        
        s.close();  }

}
