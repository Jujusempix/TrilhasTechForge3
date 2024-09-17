import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cmd;
        double Saldo_Atual = 0.0;
        double vl_dep;
        double vl_sac;
        boolean sair = false;

        Scanner sc = new Scanner(System.in);

        while (!sair) {
            System.out.println("Digite DEPOSITAR para adicionar dinheiro à conta, SACAR para sacar dinheiro da conta ou SAIR para parar:");
            cmd = sc.next().toUpperCase();
            switch (cmd) {
                case "SAIR":
                    sair = true;
                    System.out.println("SAIU");
                    break;
                case "DEPOSITAR":
                    System.out.println("Digite o valor a ser depositado:");
                    vl_dep = sc.nextDouble();
                    Saldo_Atual += vl_dep;
                    System.out.println("Saldo Atual: " + Saldo_Atual);
                    break;
                case "SACAR":
                    if (Saldo_Atual > 0) {
                        System.out.println("Digite o valor a ser sacado:");
                        vl_sac = sc.nextDouble();
                        if (vl_sac <= Saldo_Atual) {
                            Saldo_Atual -= vl_sac;
                            System.out.println("Saldo Atual: " + Saldo_Atual);
                        } else {
                            System.out.println("Valor ultrapassa o saldo bancário");
                        }
                    } else {
                        System.out.println("Você não tem saldo na conta");
                    }
                    break;
                default:
                    System.out.println("Comando Inválido");
                    break;
            }
        }
        sc.close();
    }
}