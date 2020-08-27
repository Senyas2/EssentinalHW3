package Task2;

public class Car extends Vehicle{
    public void stats(){
        setPrice(20000);
        setSpeed(250);
        setYear(2012);
        System.out.println("Price: " + getPrice()+" " + "Speed: " + getSpeed()+" " + "Year: " + getYear());
    }
}
