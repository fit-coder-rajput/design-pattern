

/**
 * AbstracFactoryTest
 * when we have families of related objects abstract factory is the best choice
 */
public class AbstracFactoryTest {

     public static void main(String[] args) {

         UIFactory factory = new WindowsFactory();
           Button btn =  factory.geButton();
           CheckBox cb =  factory.getCheckBox();
           btn.pressButton();
           cb.checkCheckBox();

           UIFactory factory2 = new MacOsFactory();
           Button btn2 =  factory2.geButton();
           CheckBox cb2=  factory2.getCheckBox();
           btn2.pressButton();
           cb2.checkCheckBox();
     }
}