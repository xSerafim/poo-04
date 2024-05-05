package Model;

public class Paralelogramo extends Quadrilatero {
  @Override
  public float calcArea() {
    return base * altura;
  }
}
