package os;

import button.Button;
import button.ButtonInit;
import button.imlButton.ButtonWindow;

public class ButtonInitWindow extends ButtonInit {

    @Override
    public Button create() {
        System.out.println("Khoi tao button window");
        return new ButtonWindow();
    }
}
