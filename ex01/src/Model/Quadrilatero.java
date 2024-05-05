package Model;

public abstract class Quadrilatero {
  float base;
  float altura;

  public float getBase() {
    return base;
  }

  public void setBase(float base) {
    this.base = base;
  }

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  public float calcPerimetro() {
    return 2 * (base + altura);
  }

  public abstract float calcArea();
}
