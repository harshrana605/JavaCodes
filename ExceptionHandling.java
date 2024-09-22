public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = divide(10,0) ;
            System.out.println("Result = " + result);
        }
        catch (Exception e) {
            System.out.println("An error occured : " + e.getMessage());
            e.printStackTrace(); 
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
public static int divide(int a, int b) {     // throws io exception
    int result = 0;
     try {
        result = a/b ;
     } catch (ArithmeticException e){
        System.out.println("Error division by zero ");
        e.printStackTrace() ; 
     }
    return result ;    // we could have returned a/b without creating try catch block 
      } 

}

// Nested try catch blocks in java  
/* public class NestedTryCatchExample {
    public static void main(String[] args) {
         try {
             // Outer try block
            System.out.println("Outer try block starts");
            
             try {
                 // Inner try block
                System.out.println("Inner try block starts");
                
                 // Simulating a potential exception
                int result = 10 / 0; // This will throw an ArithmeticException
                
                System.out.println("Inner try block ends"); // This line will not be reached
            } catch (ArithmeticException e) {
                 // Inner catch block
                 System.out.println("Inner catch block: Caught ArithmeticException");
               e.printStackTrace();
           }
            
            System.out.println("Outer try block ends"); // This line will still be reached
        } catch (Exception e) {
             // Outer catch block
             System.out.println("Outer catch block: Caught Exception");
             e.printStackTrace();
        }
    }
} */


    

