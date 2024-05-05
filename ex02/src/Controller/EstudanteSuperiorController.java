package Controller;

import Model.Estudante;

public class EstudanteSuperiorController implements IEstudanteController {
  public EstudanteSuperiorController() {
    super();
  }

  @Override
  public float percentualRendimento(Estudante estudante) {
    return estudante.getQtdAprovacoes() * estudante.getMediaNotas() * 0.972f;
  }

  @Override
  public float percentualProgressao(Estudante estudante) {
    return estudante.getQtdAprovacoes() / 6;
  }

}
