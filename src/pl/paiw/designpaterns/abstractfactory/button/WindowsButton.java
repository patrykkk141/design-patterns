package pl.paiw.designpaterns.abstractfactory.button;

public class WindowsButton implements Button {

  @Override
  public void paint() {
    System.out.println("Printing Windows button.");
  }
}
