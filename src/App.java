import button.Button;
import button.ButtonInit;
import motobike.Brand;
import os.ButtonInitLinux;
import os.ButtonInitWindow;

import java.util.HashMap;
import java.util.Map;

public class App {

    static Map<String, String> mapGame = new HashMap<>();

    public static void main(String[] args) {
//        motobike.Model model1 = new motobike.Model("WinnnerX", "2023", "den", 175);
//        model1.display();


//        Brand brand1 = new Brand("Honda", "WinnerX", "2023", "red", 175);
//        brand1.setOwner(brand1.getBrandName());
//        brand1.display();


        int os = 2; // 1 os window - 2 os linux
        ButtonInit buttonInit = null;
        //- -------------------------------------- Vung OS , minh khong can thiep


        if(os == 1) {
            buttonInit = new ButtonInitWindow();
        } else if (os == 2) {
            buttonInit = new ButtonInitLinux();
        }


        // ------------------------------------ Vung check dieu kien


        // ------------------------------------- Vung logic

        Button button = buttonInit.create();
        button.render();


        //--------------------------------------------

//        mapGame.put("key1", "value 1");
//        mapGame.put("key 2", "value 2");
//        System.out.println("Gia tri hash map " + mapGame.get("key1"));
//

    }
}
