package pl.paiw.designpaterns.abstractfactory;

import pl.paiw.designpaterns.abstractfactory.button.Button;
import pl.paiw.designpaterns.abstractfactory.checkbox.CheckBox;
import pl.paiw.designpaterns.abstractfactory.factory.UIFactory;

public class Application {

  private final Button button;
  private final CheckBox checkBox;

  public Application(UIFactory factory) {
    this.button = factory.createButton();
    this.checkBox = factory.createCheckBox();
  }

  public void paintComponents() {
    button.paint();
    checkBox.printCheckBox();
  }
}
