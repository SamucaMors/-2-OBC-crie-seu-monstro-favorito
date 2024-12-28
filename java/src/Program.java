import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do seu monstro favorito: ");
        String nomeMonstro = sc.nextLine();
        System.out.print("Digite o tipo do monstro: ");
        String tipoMonstro = sc.nextLine();
        int nivelDeForca;
        do{
            System.out.print("Digite o nível de força do monstro (1 a 100):");
            nivelDeForca = sc.nextInt();
        }while(nivelDeForca < 1 && nivelDeForca >100);
        sc.nextLine();
        System.out.print("Digite a hablidade especial do monstro: ");
        String habilidadeEspecial = sc.nextLine();

        System.out.printf("O monstro %s é um %s de nível %d e possui a habilidade especial: %s %n", nomeMonstro, tipoMonstro, nivelDeForca, habilidadeEspecial);

    }
}