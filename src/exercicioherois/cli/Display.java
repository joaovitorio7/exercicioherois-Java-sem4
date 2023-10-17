package exercicioherois.cli;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Display {

    public void exibirMenu(){
        System.out.println("** Menu ** ");
        System.out.println();
        System.out.println("1 - Cadastrar herói");
        System.out.println("2 - Cadastrar vilão");
        System.out.println("3 - Listar ");
        System.out.println("4 - Sair");
        System.out.println();
    }

    public int obterOpcao() {
        System.out.println("Informe a Opção desejada: ");
        Scanner scanner = new Scanner(System.in);
        try {
           int op = scanner.nextInt();
           return op;
        } catch (InputMismatchException e) {
            return -1;
        }

    }

    public void exibirMensagem(String mensagem) {
        System.out.println();
        System.out.println("==> " + mensagem);
        System.out.println();
    }
}
