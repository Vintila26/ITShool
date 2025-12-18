package Session10;

public class Vehicals {
    private String brand;
    private String model;
    private int year;

    public Vehicals(String brand,String model,int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String getDetails() {
        return "Vehicals{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

class Car extends Vehicals{
    private int nrDoors;

    public Car(String brand,String model,int year,int nrDoors ){
        super(brand,model,year);
        this.nrDoors = nrDoors;
    }

    public int getNrDoors() {
        return nrDoors;
    }

    public void setNrDoors(int nrDoors) {
        this.nrDoors = nrDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nrDoors=" + nrDoors +
                '}';
    }
}

class ElectricCar extends Car {
    private int inpruvebatery;
    public ElectricCar(String brand,String model,int year,int nrDoors,int inpruvebatery){
        super(brand,model,year,nrDoors);
        this.inpruvebatery = inpruvebatery;

    }

    public int getInpruvebatery() {
        return inpruvebatery;
    }

    public void setInpruvebatery(int inpruvebatery) {
        this.inpruvebatery = inpruvebatery;
    }

    @Override
    public String toString() {
        String elsectric =  "ElectricCar{" +
                "inpruvebatery=" + inpruvebatery +
                '}';
        return super.toString() + inpruvebatery;
    }

}

class Truck extends Vehicals{
    private int inpruveCapacity;

    public Truck(String brand, String model, int year, int inpruveCapacity) {
        super(brand, model, year);
        this.inpruveCapacity = inpruveCapacity;
    }

    public int getInpruveCapacity() {
        return inpruveCapacity;
    }

    public void setInpruveCapacity(int inpruveCapacity) {
        this.inpruveCapacity = inpruveCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "inpruveCapacity=" + inpruveCapacity +
                '}';
    }
}
class MainVehicles{
    public static void main(String[] args) {

        Car c1 = new Car("BMW","e39",2001,4);
        System.out.println(c1.getBrand());
        System.out.println(c1.getModel());
        System.out.println(c1.getYear());
        System.out.println(c1.getNrDoors());
        System.out.println(c1.toString());
        System.out.println(c1.getDetails());

        ElectricCar el1 = new ElectricCar("Tesla","X",2018,4,2000);
        System.out.println(el1.toString());
        System.out.println(el1.getDetails());
        System.out.println(el1.toString());
    }

}