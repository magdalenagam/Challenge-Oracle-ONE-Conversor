package conversorMonedas;

import javax.swing.JOptionPane;

public class function {

	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda en la que deseas hacer la conversion ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos Colombianos a Dólar", "De Pesos Colombianos a Euro", "De Pesos Colombianos a Libras","De Pesos Colombianos a Yen","De Pesos Colombianos a Won Coreano","De Dólar a Pesos Colombianos", "De Euro a Pesos Colombianos", "De Libras a Pesos Colombianos","De Yen a Pesos Colombianos","De Won Coreano a Pesos Colombianos"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Pesos Colombianos a Dólar":
        	monedas.ConvertirPesosColombianosADolares(Minput);
        	break;
        case "De Pesos Colombianos a Euro":
        	monedas.ConvertirPesosColombianosAEuros(Minput);
        	break;
        case "De Pesos Colombianos a Libras":
        	monedas.ConvertirPesosColombianosALibras(Minput);
        	break;
        case "De Pesos Colombianos a Yen":
        	monedas.ConvertirPesosColombianosAYen(Minput);
        	break;
        case "De Pesos Colombianos a Won Coreano":
        	monedas.ConvertirPesosColombianosAWon(Minput);
        	break;    	    	                          
        case "De Dólar a Pesos Colombianos":
        	pesos.ConvertirDolaresAPesosColombianos(Minput);
        	break;
        case "De Euro a Pesos Colombianos":
        	pesos.ConvertirEurosAPesosColombianos(Minput);
        	break;
        case "De Libras a Pesos Colombianos":
        	pesos.ConvertirLibrasAPesosColombianos(Minput);
        	break;
        case "De Yen a Pesos Colombianos":
        	pesos.ConvertirYenAPesosColombianos(Minput);
        	break;
        case "De Won Coreano a Pesos Colombianos":
            pesos.ConvertirWonAPesosColombianos(Minput);
            break;
        }      
    }
        
}
