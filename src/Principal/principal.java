package Principal;

import conversorDeMoedas.Funcao;

import javax.swing.*;

public class principal {
    public static void main(String[] args) {
        Funcao moedas = new Funcao();
        double taxaBitcoinParaReal = 130.688; 
        double taxaRealParaBitcoin = 1; 

        while (true) {
            String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moeda", "Converter Bitcoin para Real", "Converter Real para Bitcoin"}, "Escolha").toString();

            switch (opcao) {
                case "Conversor de Moeda":
                    String input = JOptionPane.showInputDialog("Insira um valor: ");
                    if (checar(input)) {
                        double valorRecebido = Double.parseDouble(input);
                        moedas.converterMoeda(valorRecebido);

                        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                        if (JOptionPane.OK_OPTION == resposta) {
                            System.out.println("Escolha opção Afirmativa");
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa finalizado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;

                case "Converter Bitcoin para Real":
                    String inputBitcoin = JOptionPane.showInputDialog("Insira a quantidade de BTC: ");
                    if (checar(inputBitcoin)) {
                        double valorBitcoin = Double.parseDouble(inputBitcoin);
                        moedas.converterBitcoinParaReais(valorBitcoin, taxaBitcoinParaReal);
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;

                case "Converter Real para Bitcoin":
                    String inputReal = JOptionPane.showInputDialog("Insira o valor em R$: ");
                    if (checar(inputReal)) {
                        double valorReal = Double.parseDouble(inputReal);
                        moedas.converterReaisParaBitcoin(valorReal, taxaRealParaBitcoin);
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
            }
        }
    }

    public static boolean checar(String input) {
        try {
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
