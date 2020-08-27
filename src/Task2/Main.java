package Task2;

public class Main {
    public static void main(String[] args) {

        Plane plane = new Plane();
        plane.setPrice(100000);
        plane.setSpeed(900);
        plane.setYear(2010);
        plane.setHight(5000);
        plane.setPass(200);
        System.out.println("Plane:");
        System.out.println("Price "+ plane.getPrice());
        System.out.println("Speed " + plane.getSpeed());
        System.out.println("Year " + plane.getYear());
        System.out.println("Hight " + plane.getHight());
        System.out.println("Pass " + plane.getPass());
        //PLANE STATS
        Vehicle vehicle = new Vehicle();
        vehicle.setPrice(1500);
        vehicle.setSpeed(45);
        vehicle.setYear(2015);
        System.out.println("Vehicle:");
        System.out.println("Price "+ vehicle.getPrice());
        System.out.println("Speed " + vehicle.getSpeed());
        System.out.println("Year " + vehicle.getYear());
        //VEHICLE STATS
        Vehicle car = new Car();
        car.setPrice(20000);
        car.setSpeed(250);
        car.setYear(2012);
        System.out.println("Car:");
        System.out.println("Price "+ car.getPrice());
        System.out.println("Speed " + car.getSpeed());
        System.out.println("Year " + car.getYear());
        // CAR Stats
        Ship ship = new Ship();
        ship.setPrice(300000);
        ship.setSpeed(120);
        ship.setYear(2006);
        ship.setPass(1000);
        ship.setPort("New York port");
        System.out.println("Ship:");
        System.out.println("Price "+ ship.getPrice());
        System.out.println("Speed "  +ship.getSpeed());
        System.out.println("Year " + ship.getYear());
        System.out.println("Pass " + ship.getPass());
        System.out.println("Port " + ship.getPort());
        //SHIP STATS
    }


}
