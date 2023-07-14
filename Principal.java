import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Selecione uma opção para contato: ");
        System.out.println("1 - Criar \n2 - Ler \n3 - Atualizar\n4 - Apagar");

        Scanner entrada = new Scanner(System.in);

        int resposta = entrada.nextInt();
        entrada.nextLine();

        if (resposta == 1) {
            Agenda agenda = new Agenda();
            agenda.criarContato();
        }


        entrada.close();
    }
}

