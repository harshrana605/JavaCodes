public class ThrowKeywordLC {
    void div(int a , int b) throws ArithmeticException {
        if (b==0){
            throw new ArithmeticException();
        }
        else {
            int c =a/b ;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        ThrowKeywordLC t = new ThrowKeywordLC() ;
        t.div(20,0); 
    }
    
}
