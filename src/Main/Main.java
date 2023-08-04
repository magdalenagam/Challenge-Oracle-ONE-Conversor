package Main;

import javax.swing.JOptionPane;
import conversorMonedas.function;

public class Main {
    public static void main (String[] args) {

      function monedas = new function();
       
      String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que queres convertir: ");
      if(ValidarNumero(input) == true) {
          double Minput = Double.parseDouble(input);
          monedas.ConvertirMonedas(Minput);

          int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
          if (JOptionPane.OK_OPTION == respuesta){
           	System.out.println("Selecciono: SI");
            }else{
             	JOptionPane.showMessageDialog(null, "Selecciono: NO. (Programa terminado)");                         
                  }
            } else {
                       JOptionPane.showMessageDialog(null, "Valor inválido");}}
        	
    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}
    