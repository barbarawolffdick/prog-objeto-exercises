
public class Paciente{
private String nome, sexo, medico, doenca;
private int idade;

  public Paciente( ){
    nome=""; sexo=""; medico=""; doenca=""; idade=0;
  }
  public void setNome(String snome){
    nome=snome;
  }
  public void setSexo(String ssexo){
    sexo=ssexo;
  }
  public void setMedico(String smedico){
    medico=smedico;
  }
  public void setDoenca(String sdoenca){
    doenca=sdoenca;
  }
  public void setIdade(int iidade){
    idade=iidade;
  }

  public String getNome()
  {
  return nome; }

  public String getSexo()
  {
  return sexo; }

  public String getMedico()
  {
  return medico; }

  public String getDoenca()
  {
  return doenca; }

  public int getIdade()
  {
  return idade;}

}
