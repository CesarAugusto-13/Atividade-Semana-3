import javax.swing.JOptionPane;
public class SomaDoComprimentoDeStrings
{
   public static void main(String [] args)
   {
   
   String palavra1 = JOptionPane.showInputDialog("Digite a primeira String ");
   String palavra2 = JOptionPane.showInputDialog("Digite a segunda String ");
   String palavra3 = JOptionPane.showInputDialog("Digite a terceira String ");
   
   int tamnha = 0;

   int tamanho = palavra1.length() + palavra2.length() + palavra3.length() ;
   
   JOptionPane.showMessageDialog(null, "A soma �: " + tamanho);
   
   }
} 