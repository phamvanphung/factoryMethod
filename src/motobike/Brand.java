package motobike;

import motobike.Model;

public class Brand extends Model {

    private String brandName;

    Brand(){
        super();
    }

    public Brand(String brandName, String model, String year, String color, int power){
        super(model, year,color, power);
        this.brandName = brandName;
    }


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public void display() {
        System.out.println("Name brand: " + this.brandName);
        super.display();
    }
}
