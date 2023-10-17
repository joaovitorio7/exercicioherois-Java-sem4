package exercicioherois;

import exercicioherois.cli.Display;
import exercicioherois.model.Opcao;

public class Aplicacao {

    private Display display = new Display();
    public void executar() {

        Opcao opcao = null;

        do{
            display.exibirMenu();
            int codigo = display.obterOpcao();
            try{
                opcao = Opcao.converter(codigo);
                processar(opcao);
            } catch (IllegalArgumentException e) {
                display.exibirMensagem(e.getMessage() );
            }


        } while (opcao != Opcao.SAIR);


    }

    private void processar(Opcao opcao) {

    }
}
