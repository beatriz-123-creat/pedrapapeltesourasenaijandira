import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("VAMOS JOGAR!");
        System.out.println("Escolha as seguintes opções:");
        System.out.println("1.pedra;");
        System.out.println("2.papel;");
        System.out.println("3.tesoura;");


        try {
            System.out.println("ESCOLHA UM NÚMERO ENTRE 1 E 3!");
            int jogadorPrincipal = leitor.nextInt();

            Random sorteio = new Random();
            int numeroSorteado = sorteio.nextInt(3) + 1;

            System.out.println("Escolha do jogador: " + definirNomeEscolha(jogadorPrincipal));
            System.out.println("Escolha do computador: " + definirNomeEscolha(numeroSorteado));

            determinarVencedor(jogadorPrincipal, numeroSorteado);
        } catch (Exception erro){
            System.out.println("Por favor, escolha deve ser um NÚMERO entre 1 e 3.");

        }


    }//caixa main

    private static void Testar() {
        System.out.println("Olá, Mundo!");

    }

    private static String definirNomeEscolha(int opcao) {

        String escolhaString = "";

        if (opcao == 1) {
            escolhaString = "PEDRA";
        } else if (opcao == 2) {
            escolhaString = "PAPEL";
        } else if (opcao == 3) {
            escolhaString = "TESOURA";
        }
        return escolhaString;

    }

    private static void determinarVencedor(int escolhaJogador, int escolhaComputador) {

        if (escolhaJogador == 1) {
            if (escolhaComputador == 1) {
                System.out.println("O JOGO EMPATOU!!");
            } else if (escolhaComputador == 2) {
                System.out.println("O COMPUTADOR VENCEU!");
            } else if (escolhaComputador == 3) {
                System.out.println("O HUMANO FRACO GANHOU!!");
            }
        } else if (escolhaJogador == 2) {
            if (escolhaComputador == 1) {
                System.out.println("O HUMANO FRACO EMPATOU!!");
            } else if (escolhaComputador == 2) {
                System.out.println("O JOGO EMPATOU!!");
            } else if (escolhaComputador == 3){
                System.out.println("O COMPUTADOR GANHOU!!");
            } else {
                if (escolhaComputador == 1) {
                    System.out.println("O COMPUTADOR VENCEU");
                } else if (escolhaComputador == 2) {
                    System.out.println("O HUMANO FRACO VENCEU!");
                } else if (escolhaComputador == 3) {
                    System.out.println("O JOGO EMPATOU");
                }
            }

        }

        //
    }
}
