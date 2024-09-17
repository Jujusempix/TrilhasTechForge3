import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite o nome da sua Universidade: ");
        String nomeUniversidade = sc.next();

        System.out.println("Digite o nome da sua Materia : ");
        String materia = sc.next();

        System.out.println("Digite sua Data de Nacimento: ");
        String dataNacimento = sc.next();

        Universidade universidade = new Universidade(nomeUniversidade,materia);
        Pessoa pessoa = new Pessoa (nome,dataNacimento);
        universidade.setUniversidade(nomeUniversidade,materia);
        pessoa.setDados(nome,dataNacimento);

        System.out.println("Seu nome é "+pessoa.nome+" que trabalha na Universidade "+universidade.nomeUniversidade+", dando aula de "+universidade.materia+", nascido em "+pessoa.dataNacimento+"." );


        String nomeUniversidade1 = "Princeton (Nova Jersey - Estados Unidos da América)";
        String materia1= "Fisica";
        Universidade universidade1 = new Universidade(nomeUniversidade1,materia1);

        String nome1 = "Einstein";
        String dataNacimento1 = "14/03/1879";
        Pessoa pessoa1 = new Pessoa(nome1,nomeUniversidade1);

        pessoa1.setDados(nome1,dataNacimento1);
        universidade1.setUniversidade(nomeUniversidade1,materia1);

        System.out.println(pessoa1.nome+" trabalhou como professor de "+universidade1.materia+" em "+universidade1.nomeUniversidade+", e nasceu em "+pessoa1.dataNacimento);

        String nomeUniversidade2 = "Cambridge (Inglaterra) ";
        String materia2 = "Matematica";

        Universidade universidade2 = new Universidade(nomeUniversidade2,materia2);

        String nome2 = "Newton";
        String dataNacimento2 = "04/01/1643";
        Pessoa pessoa2 = new Pessoa(nome2,nomeUniversidade2);

        pessoa2.setDados(nome2,dataNacimento2);
        universidade2.setUniversidade(nomeUniversidade2,materia2);

        System.out.println(pessoa2.nome+" trabalhou como professor de "+universidade2.materia+" em "+universidade2.nomeUniversidade+", e nasceu em "+pessoa2.dataNacimento);

    }
}