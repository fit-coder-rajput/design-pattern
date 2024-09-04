public class WindowsFactory  implements UIFactory{

    @Override
    public Button geButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox getCheckBox() {
        return new WindowsCheckBox();
    }
    
}
