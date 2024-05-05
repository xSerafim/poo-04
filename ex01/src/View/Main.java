package View;

import Model.Paralelogramo;
import Model.Trapezio;

public class Main {

  public static void main(String[] args) {
    Paralelogramo paralelogramo = new Paralelogramo();
    paralelogramo.setBase(10);
    paralelogramo.setAltura(5);
    System.out.println("Perímetro do paralelogramo: " + paralelogramo.calcPerimetro());
    System.out.println("Área do paralelogramo: " + paralelogramo.calcArea());

    Trapezio trapezio = new Trapezio();
    trapezio.setBase(10);
    trapezio.setBaseMenor(5);
    trapezio.setAltura(5);

    System.out.println("Perímetro do trapézio: " + trapezio.calcPerimetro());
    System.out.println("Área do trapézio: " + trapezio.calcArea());
  }
}
