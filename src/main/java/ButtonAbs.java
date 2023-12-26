public abstract class ButtonAbs {

    public abstract Button create();

    public void renderButton() {
        Button okButton = create();
        System.out.println(okButton.render());
    }
}
