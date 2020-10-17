package pl.paiw.designpaterns.abstractfactory.button;

public class MacOsButton implements Button {

  @Override
  public void paint() {
    System.out.println("Printing MacOs button.");
  }

}
