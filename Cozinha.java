import java.util.ArrayList;
import java.util.List;
import java.util.Date;

class Cozinha{

  public Cozinha (int numeroPratos,
                  String tipo,
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

  }
  private int numeroPratos;
  private String tipo;
  private int numeroCozinheiros;
  private int tempoPreparo;
  private int horaAbertura;
  private int horaFechamento;  
  private String pratoPrincipal;
  private List<Ingrediente> ingredientes = new ArrayList<>();
  private List<Funcionario> funcionarios = new ArrayList<>();

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
      retorno += "Abertura: " + horaAbertura + " às " + horaFechamento;

      stringBuilder.append(retorno);
      return stringBuilder.toString();                      
                    
    }

}