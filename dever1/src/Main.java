import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Integer idade;
                String nome;
                Double peso;
                Double altura;
                Double IMC;

                Scanner sc = new Scanner(System.in);

                System.out.println("Digite o Nome do aluno");
                nome = sc.nextLine();
                System.out.println("Digite a Idade do aluno");
                idade = sc.nextInt();
                System.out.println("Digite o Peso do aluno");
                peso = sc.nextDouble();
                System.out.println("Digite a Altura do aluno");
                altura = sc.nextDouble();

                IMC = (peso/(Math. pow(altura,2)));
                System.out.println("O IMC é igual a:"+IMC);

                if(idade >=18){
                    System.out.println("O aluno "+nome+" é maior de idade");
                }else{
                    System.out.println("O aluno "+nome+" é menor de idade");
                }
    }
}