package gomes.filipe.domain;

import java.text.NumberFormat;
import java.util.Locale;

public class Entregador extends Funcionario {
    String zona3;

    public Entregador(String nome, String sobrenome, int antiguidade, double salario) {
        super(nome, sobrenome, antiguidade, salario);
    }

    Locale localeBrazil = new Locale("pt", "BR");

    public void calculaPlusEntregador() {
        double calculoAdicional = salario / antiguidade;
        double salarioComAumentoAteTresAnos = salario + (plus / 2);
        double salarioComAumentoAcimaDeTresAnos = (calculoAdicional + plus) + salario;

        if (antiguidade <= 3) {
            System.out.println("--- Cálculo do plus para Entregador com até 3 anos de empresa ---");
            System.out.println("Adicional: salario / antiguidade ");
            System.out.println("Cálculo: Antiguidade <= 3 anos = (adicional + (plus / 2)) + salario\n");
            System.out.println("--- Dados do funcionário ---");
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Salário: " + NumberFormat.getCurrencyInstance(localeBrazil).format(salario));
            System.out.println("Antiguidade: " + antiguidade + " anos");
            System.out.println("Plus: " + NumberFormat.getCurrencyInstance(localeBrazil).format(plus));
            System.out.println("Adicional: " + NumberFormat.getCurrencyInstance(localeBrazil).format(calculoAdicional));
            System.out.println("Salário com aumento: " + NumberFormat.getCurrencyInstance(localeBrazil).format(salarioComAumentoAteTresAnos));
        } else {
            System.out.println("--- Cálculo do plus para Entregador com mais 5 anos de empresa ---");
            System.out.println("Adicional: salario / antiguidade ");
            System.out.println("Cálculo: Antiguidade > 5 anos = (adicional + plus) + salario\n");
            System.out.println("--- Dados do funcionário ---");
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Salário: " + NumberFormat.getCurrencyInstance(localeBrazil).format(salario));
            System.out.println("Antiguidade: " + antiguidade + " anos");
            System.out.println("Plus: " + NumberFormat.getCurrencyInstance(localeBrazil).format(plus));
            System.out.println("Adicional: " + NumberFormat.getCurrencyInstance(localeBrazil).format(calculoAdicional));
            System.out.println("Salário com aumento: " + NumberFormat.getCurrencyInstance(localeBrazil).format(salarioComAumentoAcimaDeTresAnos));
        }
    }
}
