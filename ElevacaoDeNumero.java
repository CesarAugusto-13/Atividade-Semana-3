import javax.swing.JOptionPane;
public class ElevacaoDeNumero 
{      
   public static void main (String [] args)
   {
   
   double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero"));
   
   double resultado = Math.pow (numero, 2); 
   
   JOptionPane.showMessageDialog(null, "O Valor �: " + resultado);
   
   }
}