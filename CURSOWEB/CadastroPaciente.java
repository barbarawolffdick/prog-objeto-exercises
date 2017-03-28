import javax.swing.*;
public class CadastroPaciente{

  public static void main(String args[]) {

    Paciente f = new Paciente();

    f.setNome(JOptionPane.showInputDialog("Entre com o Nome"));
    f.setSexo(JOptionPane.showInputDialog("Entre com o Sexo"));
    f.setMedico(JOptionPane.showInputDialog("Entre com o Medico"));
    f.setDoenca(JOptionPane.showInputDialog("Entre com o Doenca"));
    f.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Entre com a Idade")));

    JOptionPane.showMessageDialog(null,"Paciente Cadastrado" + f.getNome( ));

    System.exit(0);
  }

}
