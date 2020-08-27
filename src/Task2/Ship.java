package Task2;

public class Ship extends Vehicle{
    int count;
    String port;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public void stats() {
        setYear(2016);
        setSpeed(150);
        setPrice(100000);
        setPort("New York port");
        setCount(900);
        System.out.println("Price: " + getPrice()+" " + "Speed: " + getSpeed()+" " + "Year: " + getYear() + " "
         +"Count "       + getCount() + " "+ "Port "+ getPort());

    }
}
