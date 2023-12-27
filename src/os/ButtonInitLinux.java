package os;

import button.Button;
import button.ButtonInit;
import button.imlButton.ButtonLinux;

public class ButtonInitLinux extends ButtonInit {

    @Override
    public Button create(){
        System.out.println("Khoi tao button linux");
        return new ButtonLinux();
    }
}
