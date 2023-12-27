package button.imlButton;

import button.Button;

public class ButtonLinux implements Button {

    @Override
    public void render() {
        System.out.println("Đây là render button Linux");
    }
}
