import javax.swing.*;
class Media{
  public static void main(String args[]){
    double NOTA1, NOTA2, NOTA3, MEDIA;
    NOTA1=Double.parseDouble(JOptionPane.showInputDialog("Entre com a Nota 1"));
    NOTA2=Double.parseDouble(JOptionPane.showInputDialog("Entre com a Nota 2"));
    NOTA3=Double.parseDouble(JOptionPane.showInputDialog("Entre com a Nota 3"));
    MEDIA=(NOTA1+NOTA2+NOTA3)/3;

    if(MEDIA>7.0)
      JOptionPane.showMessageDialog(null,"A média é maior que 7.0");
      else
        if (MEDIA == 7.0);

        else
          JOptionPane.showMessageDialog(null, "A média é menor que 7.0");
          System.exit(0);
  }
}
