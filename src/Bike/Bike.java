package Bike;

public class Bike {
    public String model;
    public int make;
    public int numberOfWheels;
    public int topSpeed;     
    public int speed;    
    public boolean engine; 



public Bike() {
    
}

public Bike(String model, int make, int numberOfWheels, int topSpeed, int speed, boolean engine) {
    this.model = model;
    this.make = make;
    this.numberOfWheels = numberOfWheels;
    this.topSpeed = topSpeed;
    this.speed = speed;
    this.engine = engine;
}

public void accelerate() {
    this.speed += 10;
}
public void breakOn() {    
    this.speed -= 10;
} 

}