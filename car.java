package objectclass;

//Car class
public class Car 
{

// Create method
public void carSpeed()
{
 System.out.println("The car is going as fast as it can!");
}
public void speed(int maxSpeed)
{
 System.out.println("Max speed is: " + maxSpeed);
}
//object created
public static void main(String[] args) 
{
 Car myCar = new Car();     
 myCar.carSpeed();      
 myCar.speed(200);         
}
}
