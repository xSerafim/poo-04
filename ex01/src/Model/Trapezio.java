package Model;

public class Trapezio extends Quadrilatero {
  float baseMenor;

  public float getBaseMenor() {
    return baseMenor;
  }

  public void setBaseMenor(float baseMenor) {
    this.baseMenor = baseMenor;
  }

  @Override
  public float calcPerimetro() {
    return 2 * getAltura() + getBase() + baseMenor;
  }

  @Override
  public float calcArea() {
    return ((base + baseMenor) * altura) / 2;
  }
}
