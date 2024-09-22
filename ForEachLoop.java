
public class ForEachLoop {
    public static void main(String[] args) {
        String[] array = new String[] {
            "Harsh " , "rana " , "Shivam " , "Himanshu "
        } ;
        printforLoopArray(array) ;
        printForEachLoop(array);
    }
public static void printforLoopArray(String[] array) {
    for(int i = 0 ; i <  array.length ; i++){
        System.out.println(array[i]);
    }
}
public static void printForEachLoop(String[] array){ 
    for (String naam : array) {
        System.out.print(naam);
    }
}


    
}
