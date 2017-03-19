import javax.swing.*;
class Alunos{
  public static void main(String args[])
  {
  String NOME;
  int NUMALUNOS;
  NUMALUNOS = 1;
  while (NUMALUNOS <= 100) {
    NOME=JOptionPane.showInputDialog("Entre com o nome");
    JOptionPane.showMessageDialog(null,"Aluno cadastrado"+NOME);
  }
System.exit(0);

}
}
