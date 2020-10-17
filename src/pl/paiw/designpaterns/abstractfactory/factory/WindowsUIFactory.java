package pl.paiw.designpaterns.abstractfactory.factory;

import pl.paiw.designpaterns.abstractfactory.button.Button;
import pl.paiw.designpaterns.abstractfactory.button.WindowsButton;
import pl.paiw.designpaterns.abstractfactory.checkbox.CheckBox;
import pl.paiw.designpaterns.abstractfactory.checkbox.WindowsCheckBox;

public class WindowsUIFactory implements UIFactory {

  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new WindowsCheckBox();
  }
}
