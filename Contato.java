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

    public String getNome(){
        return nome;
    }

    public int getTelefone(){
        return telefone;
    }

    public int getIdade(){
        return idade;
    }

    public String getEndereco(){
        return endereco;
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
         
        System.out.println("Contato criado e armazenado com sucesso!\n");
    }

    public static void lerContatos(ArrayList<Contato> agenda){
        String[][] dados = new String[agenda.size() + 1][4];

        dados[0] = new String[]{"Nome", "Telefone", "Idade", "Endereço"};

        for (int i = 0; i < agenda.size(); i++){
            Contato contato = agenda.get(i);
            dados[i + 1] = new String[]{contato.getNome(), Integer.toString(contato.getTelefone()), Integer.toString(contato.getIdade()), contato.getEndereco()};
        }
        
        int[] colWidths = {20, 15, 10, 30};

        for (int i = 0; i < dados[0].length; i++) {
            System.out.printf("%-" + colWidths[i] + "s", dados[0][i]);
        }
        System.out.println();

        for (int i = 1; i < dados.length; i++) {
            for (int j = 0; j < dados[i].length; j++) {
                System.out.printf("%-" + colWidths[j] + "s", dados[i][j]);
            }
            System.out.println();
        }
    }

    public static void atualizarContato(ArrayList<Contato>agenda, Scanner entrada){
        System.out.print("Nome do contato que você deseja alterar: ");
        String nome = entrada.nextLine();

        int indiceContato = -1;

        for(int i = 0; i < agenda.size(); i++){
            Contato contato = agenda.get(i);
            if (contato.getNome().equalsIgnoreCase(nome)){
                indiceContato = i;
                break;
            }
        }

        boolean atualizouContato = true;

        if(indiceContato != -1){
            Contato contato = agenda.get(indiceContato);
            System.out.print("O que você deseja alterar?\na- Nome\nb- telefone\nc- idade\nd- endereço? ");
            String alteracao = entrada.nextLine().trim();
            
            if(alteracao.equalsIgnoreCase("a")){
                System.out.print("Novo nome: ");
                String novoNome = entrada.nextLine();
                contato.setContato(novoNome, contato.getTelefone(), contato.getIdade(), contato.getEndereco());
            
            }else if(alteracao.equalsIgnoreCase("b")){
                System.out.print("Novo telefone: ");
                int novoTelefone = entrada.nextInt();
                entrada.nextLine();

                contato.setContato(contato.getNome(), novoTelefone, contato.getIdade(), contato.getEndereco());

            }else if(alteracao.equalsIgnoreCase("c")){
                System.out.print("Nova idade: ");
                int novaIdade = entrada.nextInt();
                entrada.nextLine();

                contato.setContato(contato.getNome(), contato.getTelefone(), novaIdade, contato.getEndereco());

            }else if(alteracao.equalsIgnoreCase("d")){
                System.out.print("Novo endereço: ");
                String novoEndereco = entrada.nextLine().trim();
                contato.setContato(contato.getNome(), contato.getTelefone(), contato.getIdade(), novoEndereco);

            }else{
                System.out.print("Opção inválida!\n");
                atualizouContato = false;
            }

        }else{
            System.out.print("Contato não encontrado na agenda!\n");
            atualizouContato = false;
        }
        if(atualizouContato == true ){
            System.out.print("Contato atualizado com sucesso!\n");
        }
    }

    public static void deletarContato(ArrayList<Contato>agenda, Scanner entrada){
        System.out.print("Digite o contato que deseja remover: ");
        String nome = entrada.nextLine();

        int indiceRemover = -1;

        for(int i = 0; i < agenda.size(); i ++){
            Contato contato = agenda.get(i);
            if (contato.getNome().equalsIgnoreCase(nome)){
                indiceRemover = i;
                break;
            }
        }

        if (indiceRemover != -1){
            agenda.remove(indiceRemover);
            System.out.println("Contato excluído!");

        }else{
            System.out.println("Contato não encontrado na agenda! Tente novamente!");
        }
    }
}
