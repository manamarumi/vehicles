package Car;

public class Car {
    public String model;
    public int make;
    public int numberOfWheels;
    public int topSpeed; 
    public boolean AC;
    public int speed;
    public boolean HandBrake;
    public boolean sound;
    public boolean engine; 

    public Car() {

    }
    public Car(String model, int make, int numberOfWheels, int topSpeed, boolean AC, int speed, boolean handBrake,
            boolean sound, boolean engine) {
        this.model = model;
        this.make = make;
        this.numberOfWheels = numberOfWheels;
        this.topSpeed = topSpeed;
        this.AC = AC;
        this.speed = speed;
        this.HandBrake = handBrake;
        this.sound = sound;
        this.engine = engine;
    }

public void accelerate() {
    this.speed += 10;
}
public void breakOn() {    
    this.speed -= 10;
} 
public void handbreak(){
    System.out.println("Hold On!!!!");
       this.speed = 0;
}

}