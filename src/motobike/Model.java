package motobike;

public class Model extends Bike{

    private String name;
    private String owner;


    Model(){}
    Model(String name, String year, String color, int power) {
        super(year, color, power);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void display(){
        System.out.println("Thong tin model:");
        System.out.println("Name : " + name);
        System.out.println("Year : " + this.getYear());
        System.out.println("Color : " + this.getColor());
        System.out.println("Power : " + this.getPower());
        System.out.println("Owner : " + this.getOwner());
    }


    public void setOwner(String owner){
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }
}
