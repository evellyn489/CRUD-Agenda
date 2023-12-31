import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Contato> agenda = new ArrayList<>();
        Scanner entrada = new Scanner(System.in, "UTF-8");

        while (true){
        System.out.println("Selecione uma opção para contato: ");
        System.out.println("1 - Criar \n2 - Ler \n3 - Atualizar\n4 - Apagar\n5- Sair");

        int resposta = entrada.nextInt();
        entrada.nextLine();

        switch(resposta){
            case 1:
                System.out.println("Vamos criar um novo contato!\n");
                Contato.criarContato(agenda, entrada);
                break;

            case 2:
                System.out.println("Esses são todos os seus contatos: \n");
                Contato.lerContatos(agenda);
                break;

            case 3:
                Contato.atualizarContato(agenda, entrada);
                break;

            case 4:
                Contato.deletarContato(agenda, entrada);
                break;

            case 5:
                System.out.print("Saindo...");
                entrada.close();
                return; 
                
            default:
                System.out.print("Inválido! Tente novamente! Digite um número entre 1 e 5!\n");
                break;
            }
        }
    }
}

