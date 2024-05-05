package Controller;

import Model.Estudante;

public interface IEstudanteController {
  public float percentualRendimento(Estudante estudante);

  public float percentualProgressao(Estudante estudante);
}
