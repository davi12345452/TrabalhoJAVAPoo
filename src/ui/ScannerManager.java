package src.ui;

import java.util.Scanner;

public class ScannerManager {

  private Scanner scanner;

  public ScannerManager() {
    this.scanner = new Scanner(System.in);
  }

  public int lerInt(String mensagem) {
    System.out.print(mensagem);
    return this.scanner.nextInt();
  }

  public double lerDouble(String mensagem) {
    System.out.print(mensagem);  
    return this.scanner.nextDouble();
  }

}