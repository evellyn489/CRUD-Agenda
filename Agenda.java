import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private ArrayList<String> nomes;
    private ArrayList<Integer> telefones;
    private ArrayList<Integer> idades;
    private ArrayList<String> enderecos;

    public Agenda() {
        nomes = new ArrayList<>();
        telefones = new ArrayList<>();
        idades = new ArrayList<>();
        enderecos = new ArrayList<>();
    }

    public void criarContato() {
        Scanner entrada = new Scanner(System.in);

        String nome;
        int telefone;
        int idade;
        String endereco;

        System.out.print("Nome: ");
        nome = entrada.nextLine();

        System.out.print("Telefone: ");
        telefone = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Idade: ");
        idade = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Endereço: ");
        endereco = entrada.nextLine();

        nomes.add(nome);
        telefones.add(telefone);
        idades.add(idade);
        enderecos.add(endereco);

        entrada.close();
    }

public void imprimirContatos() {
        if (nomes.isEmpty()) {
            System.out.println("A lista de contatos está vazia.");
        } else {
            System.out.println("Lista de contatos:");
            for (String nomes : nomes) {
                System.out.println(nomes);
            }
        }
    }
}