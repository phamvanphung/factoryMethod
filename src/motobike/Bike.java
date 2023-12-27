package motobike;

public class Bike {
    private String year;
    private String color;
    private int power;



    Bike(){}

    Bike(String year, String color, int power){
        this.year = year;
        this.color = color;
        this.power = power;
    }

    Bike(String year, String color){
        this.year = year;
        this.color = color;
    }


    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }


//    public static void main(String[] args) {
//        motobike.Bike b =new motobike.Bike("2023","red",110);
//        System.out.println("Nam san xuat: " + b.getYear());
//    }



}
