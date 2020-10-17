package pl.paiw.designpaterns.abstractfactory;

import java.util.Scanner;
import pl.paiw.designpaterns.abstractfactory.factory.MacOsUIFactory;
import pl.paiw.designpaterns.abstractfactory.factory.WindowsUIFactory;

public class Main {

  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Application app = configure();
    app.paintComponents();
  }

  private static Application configure() {
    String system = null;
    printMenu();
    system = sc.next();
    Application app;

    switch (system) {
      case "M":
        app = new Application(new MacOsUIFactory());
        break;
      case "W":
        app = new Application(new WindowsUIFactory());
        break;
      default:
        throw new UnsupportedOperationException("System not recognized");
    }

    return app;
  }

  private static void printMenu() {
    System.out.println("Choose for which system print UI");
    System.out.println("[M] - MacOs");
    System.out.println("[W] - Windows");
  }
}
