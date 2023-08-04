package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	public void ConvertirDolaresAPesosArgentinos(double valor) {
		double monedaDolar = valor * 279.379;
		monedaDolar = (double) Math.round(monedaDolar *10d)/10;
        JOptionPane.showMessageDialog(null, "Tenes $ " +monedaDolar+ " pesos argentinos");
	}
	
	public void ConvertirEurosAPesosArgentinos(double valor) {
		double monedaEuro = valor * 307.909;
		monedaEuro = (double) Math.round(monedaEuro *10d)/10;
		JOptionPane.showMessageDialog(null, "Tenes $ " +monedaEuro+ " pesos argentinos");
	}
	
	public void ConvertirLibrasAPesosArgentinos(double valor) {
		double monedaLibra = valor * 356.379;
        monedaLibra = (double) Math.round(monedaLibra *10d)/10;
        JOptionPane.showMessageDialog(null, "Tenes $ " +monedaLibra+ " pesos argentinos");
	}
	
	public void ConvertirYenAPesosArgentinos(double valor) {
		double monedaYen = valor * 1.970;
        monedaYen = (double) Math.round(monedaYen *10d)/10;
        JOptionPane.showMessageDialog(null, "Tenes $ " +monedaYen+ " pesos argentinos");
	}
	
	public void ConvertirWonAPesosArgentinos(double valor) {
		double monedaWon = valor * 0.214;
        monedaWon = (double) Math.round(monedaWon *10d)/10;
        JOptionPane.showMessageDialog(null, "Tenes $ " +monedaWon+ " pesos argentinos");
	}
}
