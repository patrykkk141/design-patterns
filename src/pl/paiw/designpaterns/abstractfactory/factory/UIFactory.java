package pl.paiw.designpaterns.abstractfactory.factory;

import pl.paiw.designpaterns.abstractfactory.button.Button;
import pl.paiw.designpaterns.abstractfactory.checkbox.CheckBox;

public interface UIFactory {

  Button createButton();

  CheckBox createCheckBox();
}
