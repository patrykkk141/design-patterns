package pl.paiw.designpaterns.abstractfactory.factory;

import pl.paiw.designpaterns.abstractfactory.button.Button;
import pl.paiw.designpaterns.abstractfactory.button.MacOsButton;
import pl.paiw.designpaterns.abstractfactory.checkbox.CheckBox;
import pl.paiw.designpaterns.abstractfactory.checkbox.MacOsCheckBox;

public class MacOsUIFactory implements UIFactory {

  @Override
  public Button createButton() {
    return new MacOsButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new MacOsCheckBox();
  }
}
