package gomes.filipe.domain;

import java.text.NumberFormat;
import java.util.Locale;

public class Vendedor extends Funcionario {
    public Vendedor(String nome, String sobrenome, int antiguidade, double salario) {
        super(nome, sobrenome, antiguidade, salario);
    }

    Locale localeBrazil = new Locale("pt", "BR");

    public void calculaPlusVendedor() {
        double calculoAdicional = salario / antiguidade;
        double salarioComAumentoAteCincoAnos = salario + plus;
        double salarioComAumentoAcimaDeCincoAnos = (calculoAdicional + plus) + salario;

        if (antiguidade <= 5) {
            System.out.println("--- Cálculo do plus para Vendedor com até 5 anos de empresa ---");
            System.out.println("Cálculo: Antiguidade <= 5 anos = salário + plus\n");
            System.out.println("--- Dados do funcionário ---");
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Salário: " + NumberFormat.getCurrencyInstance(localeBrazil).format(salario));
            System.out.println("Antiguidade: " + antiguidade + " anos");
            System.out.println("Plus: " + NumberFormat.getCurrencyInstance(localeBrazil).format(plus));
            System.out.println("Salário com aumento: " + NumberFormat.getCurrencyInstance(localeBrazil).format(salarioComAumentoAteCincoAnos));
        } else {
            System.out.println("--- Cálculo do plus para Vendedor com mais 5 anos de empresa ---");
            System.out.println("Adicional: salario / antiguidade ");
            System.out.println("Cálculo: Antiguidade > 5 anos = (adicional + plus) + salario\n");
            System.out.println("--- Dados do funcionário ---");
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Salário: " + NumberFormat.getCurrencyInstance(localeBrazil).format(salario));
            System.out.println("Antiguidade: " + antiguidade + " anos");
            System.out.println("Plus: " + NumberFormat.getCurrencyInstance(localeBrazil).format(plus));
            System.out.println("Adicional: " + NumberFormat.getCurrencyInstance(localeBrazil).format(calculoAdicional));
            System.out.println("Salário com aumento: " + NumberFormat.getCurrencyInstance(localeBrazil).format(salarioComAumentoAcimaDeCincoAnos));
        }
    }
}
