package pl.paiw.designpaterns.abstractfactory.checkbox;

public class MacOsCheckBox implements CheckBox {

  @Override
  public void printCheckBox() {
    System.out.println("Printing MacOs check box.");
  }
}
