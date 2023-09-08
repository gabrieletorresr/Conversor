package conversorDeMoedas;

import javax.swing.*;

public class converteMoedas {

    public void converterReaisParaDolares(double valorRecebido){
        double moedaDolar = valorRecebido / 4.98;
        moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " Dólares");
    }

    public void converterReaisParaEuros(double valorRecebido){
        double moedaEuro = valorRecebido / 5.33;
        moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " Euros");
    }

    public void converterReaisParaLibras(double valorRecebido){
        double moedaLibra = valorRecebido / 6.21;
        moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibra + " Libras Esterlinas");
    }

    public void converterReaisParaPesosArgentinos(double valorRecebido){
        double moedaPesoArgentino = valorRecebido / 0.014;
        moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoArgentino + "Pesos Argentinos");
    }

    public void converterReaisParaPesosChilenos(double valorRecebido){
        double moedaPesoChileno = valorRecebido / 0.0056;
        moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoChileno + " Pesos Chilenos");
    }
    
    public void converterReaisParaBitcoin(double valorRecebido, double taxaRealParaBitcoin) {
        double moedaBitcoin = valorRecebido / 130861.10;
        moedaBitcoin = (double) Math.round(moedaBitcoin * 100000000) / 100000000;  // Arredondamento para 8 casas decimais (padrão do Bitcoin)
        JOptionPane.showMessageDialog(null, "Você tem " + moedaBitcoin + " BTC");
    }

	public void converterReaisParaBitcoin1(double valorRecebido, double valorRecebido2) {
		// TODO Auto-generated method stub
		
	}


}