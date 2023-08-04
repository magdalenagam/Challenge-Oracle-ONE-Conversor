package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	
	public void ConvertirPesosColombianosADolares(double valor) {
		double monedaDolar = valor / 3739.00;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tenes $ " +monedaDolar+ " dolares");
	}
	
	public void ConvertirPesosColombianosAEuros(double valor) {
		double monedaEuro = valor / 4050.48;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tenes $ " +monedaEuro+ " euros");
	}
	
	public void ConvertirPesosColombianosALibras(double valor) {
		double monedaLibra = valor / 4890.52;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tenes $ " +monedaLibra+ " libras esterlinas");
	}
	
	public void ConvertirPesosColombianosAYen(double valor) {
		double monedaYen = valor / 29.68;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tenes $ " +monedaYen+ " yuanes");
	}
	
	public void ConvertirPesosColombianosAWon(double valor) {
		double monedaWon = valor / 3.04;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tenes $ " +monedaWon+ " wons");
	}
}
