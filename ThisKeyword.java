class Car {
    int noOfWheels ;
    String color ;
    int maxSpeed ;
    int currentFuelinLitres ;

    Car(String color){
         noOfWheels = 4 ;
         this.color  = color;
         maxSpeed = 150;
         currentFuelinLitres = 5 ;

    }
    Car(){  // default constructor for setting default color  if no argument is passed
        this("Black") ;

   }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Car swift = new Car(); 
        System.out.println(swift.color) ;
    }
    
}
