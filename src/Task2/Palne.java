package Task2;

public class Palne extends Vehicle {
   private int hight;
   private int count;

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void stats() {
        setPrice(100000);
        setSpeed(1200);
        setYear(2020);
        setCount(350);
        setHight(3000);
        System.out.println("Price: " + getPrice()+" " + "Speed: " + getSpeed()+" " + "Year: " + getYear() + " "+
        "Count "+ getCount() + " " + "Hight "+ getHight());
    }
}
