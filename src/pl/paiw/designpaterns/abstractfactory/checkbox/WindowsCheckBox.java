package pl.paiw.designpaterns.abstractfactory.checkbox;

public class WindowsCheckBox implements CheckBox {

  @Override
  public void printCheckBox() {
    System.out.println("Printing Windows check box.");
  }
}
