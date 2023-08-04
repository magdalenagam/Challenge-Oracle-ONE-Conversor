package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	
	public void ConvertirPesosArgentinosADolares(double valor) {
		double monedaDolar = valor / 279.380;
		monedaDolar = (double) Math.round(monedaDolar *10d)/10;
        JOptionPane.showMessageDialog(null, "Tenes $ " +monedaDolar+ " dolares");
	}
	
	public void ConvertirPesosArgentinosAEuros(double valor) {
		double monedaEuro = valor / 307.909;
		monedaEuro = (double) Math.round(monedaEuro *10d)/10;
		JOptionPane.showMessageDialog(null, "Tenes $ " +monedaEuro+ " euros");
	}
	
	public void ConvertirPesosArgentinosALibras(double valor) {
		double monedaLibra = valor / 356.379;
        monedaLibra = (double) Math.round(monedaLibra *10d)/10;
        JOptionPane.showMessageDialog(null, "Tenes $ " +monedaLibra+ " libras esterlinas");
	}
	
	public void ConvertirPesosArgentinosAYen(double valor) {
		double monedaYen = valor / 1.970;
        monedaYen = (double) Math.round(monedaYen *10d)/10;
        JOptionPane.showMessageDialog(null, "Tenes $ " +monedaYen+ " yuanes");
	}
	
	public void ConvertirPesosArgentinosAWon(double valor) {
		double monedaWon = valor / 0.214;
        monedaWon = (double) Math.round(monedaWon *10d)/10;
        JOptionPane.showMessageDialog(null, "Tenes $ " +monedaWon+ " wons");
	}
}
