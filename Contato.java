import java.util.ArrayList;
import java.util.Scanner;

public class Contato {
    private String nome;
    private int telefone;
    private int idade;
    private String endereco;

    public Contato(String nome, int telefone, int idade, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        this.endereco = endereco;

    }

    public void setContato(String nomePessoa, int telefonePessoa, int idadePessoa, String enderecoPessoa){
        this.nome = nomePessoa;
        this.telefone = telefonePessoa;
        this.idade = idadePessoa;
        this.endereco = enderecoPessoa;

    }

    public String getContato(){
        return String.format("Nome: %s, Telefone: %d, Idade: %d, Endereço: %s", nome, telefone, idade, endereco);
    }

    public static void criarContato(ArrayList<Contato>agenda, Scanner entrada){
        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Telefone: ");
        int telefone = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Endereço: ");
        String endereco = entrada.nextLine();

        Contato contato = new Contato(nome, telefone, idade, endereco);
        agenda.add(contato);
         
        System.out.println("Contato criado e armazenado com sucesso!");
        
    }

    public static void lerContatos(ArrayList<Contato> agenda){
        for (Contato contato : agenda){
            System.out.println(contato.getContato());
        }
    }
}
