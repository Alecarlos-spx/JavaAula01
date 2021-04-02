import java.time.LocalDate;

class Ingrediente{

  public Ingrediente(String nome, LocalDate dataValidade){

    this.nome = nome;
    this.dataValidade = dataValidade;
  }

  protected String nome;
  protected LocalDate dataValidade;
}