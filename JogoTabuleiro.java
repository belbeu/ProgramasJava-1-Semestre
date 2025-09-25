package Pacote;

import java.util.Scanner;
import java.util.Random;

public class JogoTabuleiro {

	//lança o dado
    public static int lancarDado() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    //mostra estado do jogo
    public static String mostrarEstado(int posicaoJogador1, int posicaoJogador2) {
        return "Posição do jogador 1: " + posicaoJogador1 + "\nPosição do jogador 2: " + posicaoJogador2;
    }

    //verifica missão
    public static String verificarMissao(int posicaoAtual) {
        String resposta;
        switch (posicaoAtual) {
            case 3: {
                resposta = "\nImite a pose do filme Titanic";
                break;
            }
            case 5: {
                resposta = "\nDiga o nome de um animal que começa com a letra \"C\"";
                break;
            }
            case 6: {
                resposta = "\nJogue novamente";
                break;
            }
            case 7: {
                resposta = "\nCante um trecho de uma música famosa";
                break;
            }
            case 9: {
                resposta = "\nAvance 2 casas";
                break;
            }
            case 10: {
                resposta = "\nConte uma piada";
                break;
            }
            case 12: {
                resposta = "\nFaça uma dança rápida";
                break;
            }
            case 13: {
                resposta = "\nVolte 5 casas";
                break;
            }
            case 15: {
                resposta = "\nBata palmas 5 vezes";
                break;
            }
            case 16: {
                resposta = "\nPule no lugar 3 vezes";
                break;
            }
            case 18: {
                resposta = "\nFaça uma pose de super-herói";
                break;
            }
            case 20: {
                resposta = "\nJogue novamente mais 2 vezes";
                break;
            }
            case 21: {
                resposta = "\nDiga o nome de um filme que você gosta";
                break;
            }
            case 22: {
                resposta = "\nImite uma criança com birra";
                break;
            }
            case 24: {
                resposta = "\nFaça um som de animal";
                break;
            }
            case 25: {
                resposta = "\nDiga a data de aniversário de um parente seu";
                break;
            }
            case 27: {
                resposta = "\nDiga uma curiosidade sobre tecnologia";
                break;
            }
            case 28: {
                resposta = "\nPasse a vez";
                break;
            }
            case 29: {
                resposta = "\nImite um robô andando";
                break;
            }
            case 30: {
                resposta = "\nFinal do jogo <3";
                break;
            }
            default: {
                resposta = "\nNenhuma missão";
            }
        }
        return resposta;
    }

    //Verifica se a posição é exatamente 30
    public static boolean verificarVencedor(int posicao) {
        return posicao == 30;
    }

    //Jogar uma rodada
    public static int jogarRodada(int jogadorAtual, int posicaoAtual) {
        int dado = lancarDado();
        System.out.println("Jogador " + jogadorAtual + " tirou: " + dado);

        posicaoAtual += dado;

        if (posicaoAtual > 30) {
            posicaoAtual = 30;
        }

        System.out.println("Nova posição: " + posicaoAtual);
        System.out.println("Missão: " + verificarMissao(posicaoAtual));

        return posicaoAtual;
    }

    //Alternar entre os jogadores
    public static int alternarJogador(int jogadorAtual) {
        return (jogadorAtual == 1) ? 2 : 1;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int jogador1 = 0, jogador2 = 0;
        int vez = 1;

        while (true) {
            System.out.println("\nVez do Jogador " + vez);
            System.out.println("Pressione ENTER para lançar o dado");
            entrada.nextLine();

            if (vez == 1) {
                jogador1 = jogarRodada(1, jogador1);
                if (verificarVencedor(jogador1)) {
                    System.out.println("Jogador 1 venceu o jogo!");
                    break;
                }
            } else {
                jogador2 = jogarRodada(2, jogador2);
                if (verificarVencedor(jogador2)) {
                    System.out.println("Jogador 2 venceu o jogo!");
                    break;
                }
            }

            System.out.println(mostrarEstado(jogador1, jogador2));
            vez = alternarJogador(vez);
        }

        entrada.close();
    }
}
