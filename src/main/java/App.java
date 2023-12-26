public class App {

    public static void main(String[] args) {
        int os = 2;
        ButtonAbs button = null;

        if(os == 1) {
            button = new ButtonWindownCreate();
        } else if (os == 2) {
            button = new ButtonLinuxCreate();
        }


        button.renderButton();
        ////


    }
}
