package View;

import Controller.EstudanteSuperiorController;
import Controller.EstudanteTecnicoController;
import Model.EstudanteSuperior;
import Model.EstudanteTecnico;

public class Main {
  public static void main(String[] args) {
    EstudanteSuperior eSuperior = new EstudanteSuperior();
    eSuperior.setRa("123456");
    eSuperior.setNome("João da Silva");
    eSuperior.setEmail("email@email.com");
    eSuperior.setMediaNotas(8.5f);
    eSuperior.setQtdAprovacoes(5);
    eSuperior.setInstituicaoSegundoGrau("Colégio Estadual");
    eSuperior.setAnoConclusaoSegundoGrau(2015);

    EstudanteTecnico eTecnico = new EstudanteTecnico();
    eTecnico.setRa("654321");
    eTecnico.setNome("Maria da Silva");
    eTecnico.setEmail("email@email2.com");
    eTecnico.setMediaNotas(7.5f);
    eTecnico.setQtdAprovacoes(3);

    EstudanteSuperiorController eSuperiorController = new EstudanteSuperiorController();
    EstudanteTecnicoController eTecnicoController = new EstudanteTecnicoController();

    System.out
        .println("Estudante Superior percentual de progressão: " + eSuperiorController.percentualProgressao(eSuperior));
    System.out
        .println("Estudante Superior percentual de rendimento: " + eSuperiorController.percentualRendimento(eSuperior));
    System.out
        .println("Estudante Técnico percentual de progressão: " + eTecnicoController.percentualProgressao(eTecnico));
    System.out
        .println("Estudante Técnico percentual de rendimento: " + eTecnicoController.percentualRendimento(eTecnico));
  }
}
