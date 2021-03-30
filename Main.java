import java.util.Date;
import java.util.List;

class Main {
  public static void main(String[] args) {
System.out.println("Iniciando os trabalhos do restaurante...");

  Cozinha cozMin = new Cozinha(10, Cozinha.Origem.Mineira , 5, 30, 14, 20, "Virado");
    
    cozMin.acrescentarIngredientes("Feijão", new Date(2022-05-10));
    cozMin.acrescentarIngredientes("Farinha", new Date(2022-05-10));
    cozMin.acrescentarIngredientes("Arroz", new Date(2022-05-10));
    cozMin.acrescentarIngredientes("Carne de Porco", new Date(2022-05-10));
    cozMin.acrescentarIngredientes("Linguiça", new Date(2022-05-10));

    cozMin.adicionarFuncionario("Alexandre", "Garçon");
    cozMin.adicionarFuncionario("Marcos", "Cozinheiro");
    cozMin.adicionarFuncionario("Fernanda", "Gerente");
    cozMin.adicionarFuncionario("Manoela", "Atendente");



  //cozMin.ingredientes.forEach(item->System.out.println(item.dataValidade));
    
  Cozinha cozChi = new Cozinha(15,Cozinha.Origem.Chinesa, 1, 50, 13, 22, "Yakissoba");
    cozChi.acrescentarIngredientes("Feijão", new Date(2022-05-10));
    cozChi.acrescentarIngredientes("Farinha", new Date(2022-05-10));
    cozChi.acrescentarIngredientes("Arroz", new Date(2022-05-10));
    cozChi.acrescentarIngredientes("Carne de Porco", new Date(2022-05-10));
    cozChi.acrescentarIngredientes("Linguiça", new Date(2022-05-10));

    cozChi.adicionarFuncionario("Thai", "Garçon");
    cozChi.adicionarFuncionario("Makai", "Sushimam");
    cozChi.adicionarFuncionario("Mogi", "Gerente");
    cozChi.adicionarFuncionario("Kai", "Atendente");


  Cozinha cozIt = new Cozinha(15,Cozinha.Origem.Italiana, 1, 50, 13, 22, "Macarronada");
    cozIt.acrescentarIngredientes("Feijão", new Date(2022-05-10));
    cozIt.acrescentarIngredientes("Farinha", new Date(2022-05-10));
    cozIt.acrescentarIngredientes("Arroz", new Date(2022-05-10));
    cozIt.acrescentarIngredientes("Carne de Porco", new Date(2022-05-10));
    cozIt.acrescentarIngredientes("Linguiça", new Date(2022-05-10));

    cozIt.adicionarFuncionario("Paulo", "Garçon");
    cozIt.adicionarFuncionario("Lucas", "Cozinheiro");
    cozIt.adicionarFuncionario("Edimar", "Gerente");
    cozIt.adicionarFuncionario("Joaquim", "Atendente");

  Cozinha cozAl = new Cozinha(7,Cozinha.Origem.Alema, 1, 60, 12, 24, "Königsberger Klopse");
    cozAl.acrescentarIngredientes("anchovas", new Date(2022-05-10));
    cozAl.acrescentarIngredientes("alcaparras", new Date(2022-05-10));
    cozAl.acrescentarIngredientes("creme de leite", new Date(2022-05-10));
    cozAl.acrescentarIngredientes("carne moída", new Date(2022-05-10));
    cozAl.acrescentarIngredientes("Suco de um limão", new Date(2022-05-10));

    cozAl.adicionarFuncionario("Paulo", "Garçon");
    cozAl.adicionarFuncionario("Lucas", "Cozinheiro");
    cozAl.adicionarFuncionario("Edimar", "Gerente");
    cozAl.adicionarFuncionario("Joaquim", "Atendente");

  System.out.println("Nossos tipos de culinária");
  System.out.println("\n");
  System.out.println(cozAl);
  System.out.println("\n");
  System.out.println(cozIt);
  System.out.println("\n");
  System.out.println(cozChi);
  System.out.println("\n");
  System.out.println(cozMin);
  System.out.println("\n");

  

  }
}