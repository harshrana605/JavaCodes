public class NestedCatch {
    public static void main(String[] args) { 

        // Jab catch block mein bhi exception ho tab ye karna hai 


        try {
          System.out.println(10/0);
        }
        catch(Exception e) {
            System.out.println(e);
            try { 
                String a = null ;
                System.out.println(a.toLowerCase());
            }
            catch(NullPointerException n){ 
                 System.out.println("Null pointer exception");
                 System.out.println(n);
            }
        }
        System.out.println("Main method executed");
    }
    
}
