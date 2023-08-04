package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	public void ConvertirDolaresAPesosColombianos(double valor) {
		double monedaDolar = valor * 3739.00;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tenes $ " +monedaDolar+ " pesos colombianos");
	}
	
	public void ConvertirEurosAPesosColombianos(double valor) {
		double monedaEuro = valor * 4050.48;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tenes $ " +monedaEuro+ " pesos colombianos");
	}
	
	public void ConvertirLibrasAPesosColombianos(double valor) {
		double monedaLibra = valor * 4890.52;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tenes $ " +monedaLibra+ " pesos colombianos");
	}
	
	public void ConvertirYenAPesosColombianos(double valor) {
		double monedaYen = valor * 29.68;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tenes $ " +monedaYen+ " pesos colombianos");
	}
	
	public void ConvertirWonAPesosColombianos(double valor) {
		double monedaWon = valor * 3.04;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tenes $ " +monedaWon+ " pesos colombianos");
	}
}
