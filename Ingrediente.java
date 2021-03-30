import java.util.Date;

class Ingrediente{

  public Ingrediente(String nome, Date dataValidade){

    this.nome = nome;
    this.dataValidade = dataValidade;
  }

  protected String nome;
  protected Date dataValidade;
}