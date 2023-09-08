package conversorDeMoedas;

import javax.swing.JOptionPane;

public class Funcao {

    converteMoedas moedas = new converteMoedas();
    converteMoedasParaReais reais = new converteMoedasParaReais();
    
    public void converterBitcoinParaReais(double valorRecebido, double taxaBitcoinParaReal) {
        double moedaReal = valorRecebido * taxaBitcoinParaReal;
        moedaReal = (double) Math.round(moedaReal * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaReal);
    }

    public void converterReaisParaBitcoin(double valorRecebido, double taxaRealParaBitcoin) {
        double moedaBitcoin = valorRecebido / taxaRealParaBitcoin;
        moedaBitcoin = (double) Math.round(moedaBitcoin * 100000000) / 100000000;  // Arredondamento para 8 casas decimais (padrão do Bitcoin)
        JOptionPane.showMessageDialog(null, "Você tem " + moedaBitcoin + " BTC");
    }


    public void converterMoeda(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null,
                "Escolha a moeda para a qual você deseja girar seu dinheiro ", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Peso Argentino", "De Reais a Peso Chileno", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais", "De Peso Argentino a Reais", "De Peso Chileno a Reais"}, "Escolha")).toString();

        switch (opcao) {
            case "De Reais a Dólares":
                moedas.converterReaisParaDolares(valorRecebido);
                break;
            case "De Reais a Euros":
                moedas.converterReaisParaEuros(valorRecebido);
                break;
            case "De Reais a Libras":
                moedas.converterReaisParaLibras(valorRecebido);
                break;
            case "De Reais a Peso Argentino":
                moedas.converterReaisParaPesosArgentinos(valorRecebido);
                break;
            case "De Reais a Peso Chileno":
                moedas.converterReaisParaPesosChilenos(valorRecebido);
                break;
            case "De Dólares a Reais":
                reais.converterDolaresParaReais(valorRecebido);
                break;
            case "De Euros a Reais":
                reais.converterEurosParaReais(valorRecebido);
                break;
            case "De Libras a Reais":
                reais.converterLibrasParaReais(valorRecebido);
                break;
            case "De Peso Argentino a Reais":
                reais.converterPesosArgentinosParaReais(valorRecebido);
                break;
            case "De Peso Chileno a Reais":
                reais.converterPesosChilenosParaReais(valorRecebido);
                break;
          
        }
    }

	public void converterReaisParaBitcoin1(double valorReal, double taxaRealParaBitcoin) {
		// TODO Auto-generated method stub
		
	}
}
