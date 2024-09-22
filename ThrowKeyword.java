import java.util.Scanner ;

public class ThrowKeyword {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("Enter your age ");
        int age = s.nextInt() ; 
        try {
            if (age<18){
                throw new YoungAgeException("You are not eligible") ;   // programmer is deciding here 
            }
            else {
                System.out.println("You can vote ");
            }
        }
        catch (YoungAgeException e) {
            e.printStackTrace(); 
        }
        finally { 
             s.close() ;
        }
        System.out.println("Hello");
    }
}
class YoungAgeException extends Exception {
    YoungAgeException(String msg) {
    super (msg);
      }
    } 
    
    

