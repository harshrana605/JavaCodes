public class StringBuilder123 {

   int noOfWheels ;
   int noOfDoors ;
   int maxSpeed ;
   String name ;
   String company ; 
   
public String toString() {
    final StringBuilder sb = new StringBuilder("Car{");
    sb.append(noOfWheels).append(noOfDoors).append(maxSpeed) ;
    return sb.toString();                 
}
public static void main(String[] args) {
    StringBuilder123 sb = new StringBuilder123();
    sb.toString();   
    
}


    
}
