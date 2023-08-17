package trabalho;

import javax.swing.*;

public class TRABALHO {

    public static void main(String[] args) {

        double[] nota = new double[3];
        double apr = 0, rep = 0, qtd = 0, soma = 0, qtdN = 0;
        String[] nome = new String[5];
        double[] md = new double[5];
        String listaA = "", listaR = "";

        qtd = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de alunos na sala? "));

        for (int n = 0; n < qtd; n++) {
            nome[n] = JOptionPane.showInputDialog("Qual o nome do aluno " + n);

            soma=0;
            for (int i = 0; i < nota.length; i++) {
                nota[i] = Double.parseDouble(JOptionPane.showInputDialog(" Informe a nota " + i + " de " + nome[n] + " : "));
                soma += nota[i];

                

            }
            md[n] = (soma / nota.length);
            
            
            if (md[n] >= 7) {
                listaA += nome[n] + " " + md[n];
            } else if (md[n] < 7) {
                listaR += nome[n] + " " + md[n];
               

            }

            JOptionPane.showMessageDialog(null, "Aprovados:\n " + listaA + " " + " \nReprovados:\n " + listaR + " ");
        }
    }
}
