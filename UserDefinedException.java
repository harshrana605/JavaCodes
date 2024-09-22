class InvalidAgeException extends Exception {       // constructor for user defined exception
     InvalidAgeException(String msg){
        System.out.println(msg);
     }
}
public class UserDefinedException {
    public static void main(String[] args) {
        try {
            vote(12);   // risky code 
        }
        catch(Exception e ){
            System.out.println(e);
        }
    }
public  static void vote(int age) throws InvalidAgeException{
    if(age<18){
         throw new InvalidAgeException("Not Eligible for Voting"); 
         
     }
    else {
        System.out.println("Eligible for voting");
    }
}

    
}
