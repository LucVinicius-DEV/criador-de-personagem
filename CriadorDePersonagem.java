// Este programa simula a criacao de personagem de jogo.
import java.util.Scanner;

public class CriadorDePersonagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ESCOLHA A CLASSE DO SEU PERSONAGEM:");
        System.out.println("[1] GUERREIRO  [2] MAGO  [3] ARQUEIRO");
        System.out.print("Digite o número da classe escolhida: ");
        int Classe = sc.nextInt();
        String Personagem;
        int forca = 0, inteligencia = 0, agilidade = 0;
        switch (Classe) {
            case 1:
                Personagem = "Guerreiro";
                forca = 70;
                inteligencia = 30;
                agilidade = 40;
                break;
            case 2:
                Personagem = "Mago";
                forca = 20;
                inteligencia = 90;
                agilidade = 50;
                break;
            case 3:
                Personagem = "Arqueiro";
                forca = 40;
                inteligencia = 40;
                agilidade = 80;
                break;
            default:
                Personagem = "Classe inválida";
                break;
        }

        sc.nextLine(); // limpa o buffer antes de ler o nome
        System.out.print("DIGITE UM NOME PARA SEU PERSONAGEM: ");
        String nome = sc.nextLine();
        
        switch (Classe) {
            case 1:
                forca += 10;
                break;
            case 2:
                inteligencia += 10;
                break;
            case 3:
                agilidade += 10;
                break;
        } // bônus de força

        String status = (forca >= 80) ? "Forte" : "Normal";

        System.out.println("\n--- FICHA DO PERSONAGEM ---");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + Personagem);
        System.out.println("Força: " + forca);
        System.out.println("Inteligência: " + inteligencia);
        System.out.println("Agilidade: " + agilidade);
        System.out.println("Status: " + status);
    
    sc.close();
    }
}
