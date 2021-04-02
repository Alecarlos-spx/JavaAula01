import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

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
 
public String getPratoPrincipal() {
  return this.pratoPrincipal;
}

public void setPratoPrincipal(String pratoPrincipal){
  this.pratoPrincipal = pratoPrincipal;
}

public int getHoraFechamento() {
  return this.horaFechamento;
}

public void setHoraFechamento(int horaFechamento){
  this.horaFechamento = horaFechamento;
}

public int getHoraAbertura() {
  return this.horaAbertura;
}

public void setHoraAbertura(int horaAbertura){
  this.horaAbertura = horaAbertura;
}


public int getTempoPreparo() {
  return this.tempoPreparo;
}

public void setTempoPreparo(int tempoPreparo){
  this.tempoPreparo = tempoPreparo;
}


public int getNumeroCozinheiros() {
  return this.numeroCozinheiros;
}

public void setNumeroCozinheiros(int numeroCozinheiros){
  this.numeroCozinheiros = numeroCozinheiros;
}

public Origem getTipo() {
    return this.tipo;
}
  
public void setTipo(Origem tipo){
    this.tipo = tipo;
}

public int getNumeroPratos() {
  return this.numeroPratos;
}

public void setNumeroPratos(int numeroPratos){
  this.numeroPratos = numeroPratos;
}


void acrescentarIngredientes(String nome, LocalDate dataValidade){
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
      retorno += "Prato Principal: " + pratoPrincipal+"\n";
      retorno += "Culinária: "+ tipo + "\n";
      retorno += "Cozinheiros: " + numeroCozinheiros + "\n";
      retorno += "Numero de Pratos: " + numeroPratos +"\n";
      retorno += "Tempo de Preparo: " + tempoPreparo + "\n";
      retorno += "Abertura: " + horaAbertura + " às " + horaFechamento + "\n\n";

      stringBuilder.append(retorno);

      stringBuilder.append("Principais ingredientes \n");

      for(Ingrediente ingrediente : ingredientes){
 

        LocalDate localdate = ingrediente.dataValidade;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedString = localdate.format(formatter);
        
        retorno = ingrediente.nome.toString() +" - " +  " Validade : " +  formattedString +  "\n";

        stringBuilder.append(retorno);
      }

      stringBuilder.append("\nFuncionários \n");

      for(Funcionario funcionario : funcionarios){
        retorno = funcionario.nome.toString() +" - " + funcionario.atividade.toString() + "\n";

        stringBuilder.append(retorno);
      }

      return stringBuilder.toString();                      
                    
    }

}