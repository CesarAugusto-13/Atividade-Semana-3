import javax.swing.JOptionPane;
public class AreaDoRetangulo
{
   public static void main (String [] args)
   {
   
   double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retângulo"));
   
   double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do retângulo"));
   
   double area = altura * largura;
   
   JOptionPane.showMessageDialog(null, "A area do retângulo é: " + area);
   
   }
}  