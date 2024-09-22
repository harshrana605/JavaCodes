 class Vehicle{
    public int numberOfTires ;
    public void commute() {
        System.out.printf("I am going from place A to place B using %d tires \n" , numberOfTires);
    }
}
 class TwoWheeler extends Vehicle {
    TwoWheeler(){
        numberOfTires = 2 ;   //  we cant assign values directly in class without creting constructor 
    }

}

public class Inheritance {
public static void main(String[] args) { 
    Vehicle v1 = new Vehicle();
    TwoWheeler two = new TwoWheeler() ;

    v1.commute();
    two.commute(); 
    
}
}
