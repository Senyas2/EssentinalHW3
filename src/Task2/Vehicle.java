package Task2;

public class Vehicle {
    private int price;
    private int speed;
    private int year;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
class Plane extends Vehicle{
    int Hight;
    int Pass;

    public int getHight() {
        return Hight;
    }

    public void setHight(int hight) {
        Hight = hight;
    }

    public int getPass() {
        return Pass;
    }

    public void setPass(int pass) {
        Pass = pass;
    }
}
class Car extends  Vehicle{

}
class  Ship extends Vehicle{
    int Pass;
    String Port;

    public int getPass() {
        return Pass;
    }

    public void setPass(int pass) {
        Pass = pass;
    }

    public String getPort() {
        return Port;
    }

    public void setPort(String port) {
        Port = port;
    }
}