import java.util.ArrayList;
import java.util.List;
import java.util.Date;

class Cozinha{

  public enum Origem{
    Mineira, Chinesa, Italiana, Alema
  }

  public Cozinha (int numeroPratos,
                  Origem tipo,
                  int numeroCozinheiros,
                  int tempoPreparo,
                  int horaAbertura,
                  int horaFechamento,
                  String pratoPrincipal
                )
                {
                  this.numeroPratos = numeroPratos;
                  this.tipo = tipo;
                  this.numeroCozinheiros = numeroCozinheiros;
                  this.tempoPreparo = tempoPreparo;
                  this.horaAbertura = horaAbertura;
                  this.horaFechamento = horaFechamento;
                  this.pratoPrincipal = pratoPrincipal;
                  ingredientes = new ArrayList<>();
                  funcionarios = new ArrayList<>();
  }
  private int numeroPratos;
  private Origem tipo;
  private int numeroCozinheiros;
  private int tempoPreparo;
  private int horaAbertura;
  private int horaFechamento;  
  private String pratoPrincipal;
  private List<Ingrediente> ingredientes;
  private List<Funcionario> funcionarios;

void acrescentarIngredientes(String nome, Date dataValidade){
  Ingrediente ingrediente = new Ingrediente(nome, dataValidade);
  ingredientes.add(ingrediente);
}

void adicionarFuncionario(String nome, String atividade){
  Funcionario funcionario = new Funcionario(nome, atividade);
  funcionarios.add(funcionario);
}

@Override
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      String retorno = "";
      retorno += "Dados da Cozinha \n";
      retorno += "Numero de Pratos: " + numeroPratos +"\n";
      retorno += "Tipo:"+ tipo + "\n";
      retorno += "Cozinheiros: " + numeroCozinheiros + "\n";
      retorno += "Tempo de Preparo: " + tempoPreparo + "\n";
      retorno += "Abertura: " + horaAbertura + " às " + horaFechamento + "\n\n";

      stringBuilder.append(retorno);

      stringBuilder.append("Principais ingredientes \n");

      for(Ingrediente ingrediente : ingredientes){
        retorno = ingrediente.nome.toString() +"\n";
        stringBuilder.append(retorno);
      }

      stringBuilder.append("\n Funcionários \n");

      for(Funcionario funcionario : funcionarios){
        retorno = funcionario.nome.toString() +"\n";
        stringBuilder.append(retorno);
      }



      return stringBuilder.toString();                      
                    
    }

}