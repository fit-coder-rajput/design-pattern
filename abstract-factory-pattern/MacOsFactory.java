public class MacOsFactory  implements UIFactory{

    @Override
    public Button geButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox getCheckBox() {
       return new MacOsCheckBox();
    }
    
}
