public class MulticatchBlock {
    public static void main(String[] args) {
        try{
          int a=10, b=2 , c ;
          c = a/b ;
          System.out.println(c);

          int[] array = {5,6,7,8} ;
          System.out.println(array[5]);

          String str = "ankit";
          System.out.println(str.toUpperCase());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Exception");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch (Exception e){
            System.out.println("All types of exceptions handled");
        }
    }
    
}
