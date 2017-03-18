import javax.swing.*;
class DadosProfessor {
public static void main(String args[])
{
String NOME;
int RG;
NOME = JOptionPane.showInputDialog("Entre com o Nome");
RG = Integer.parseInt(JOptionPane.showInputDialog("Entre com o RG"));

JOptionPane.showMessageDialog(null,"Nome" + NOME);
JOptionPane.showMessageDialog(null,"RG" + RG);

System.exit(0);
}
}
