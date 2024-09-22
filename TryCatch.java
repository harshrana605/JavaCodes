public class TryCatch {
    public static void main(String[] args) {
        String str = "Harsh" ;
        String str2 = "123" ;

        try{
            int a = Integer.parseInt(str2) ;
            int b = Integer.parseInt(str) ;
            System.out.println(a);
            System.out.println(b);
        }
        catch (NumberFormatException e) {
             System.out.println("String cant be converted " + str + str2);
        }
    }
    
}
