package Controller;

import Model.Estudante;

public class EstudanteTecnicoController implements IEstudanteController {
  public EstudanteTecnicoController() {
    super();
  }

  @Override
  public float percentualRendimento(Estudante estudante) {
    return estudante.getQtdAprovacoes() * estudante.getMediaNotas() * 0.931f;
  }

  @Override
  public float percentualProgressao(Estudante estudante) {
    return estudante.getQtdAprovacoes() / 3;
  }
}
