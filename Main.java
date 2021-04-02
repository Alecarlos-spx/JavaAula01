
import java.time.LocalDate;
import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException, InterruptedException {
System.out.println("Iniciando os trabalhos do restaurante...");

  Cozinha cozMin = new Cozinha(10, Cozinha.Origem.Mineira , 5, 30, 14, 20, "Virado");
    
    cozMin.acrescentarIngredientes("Feijão", LocalDate.of(2021,5,14));
    cozMin.acrescentarIngredientes("Farinha", LocalDate.of(2021, 05,12));
    cozMin.acrescentarIngredientes("Arroz", LocalDate.of(2021, 05,10));
    cozMin.acrescentarIngredientes("Carne de Porco", LocalDate.of(2021, 04,04));
    cozMin.acrescentarIngredientes("Linguiça", LocalDate.of(2021, 04,10));

    cozMin.adicionarFuncionario("Alexandre", "Garçon");
    cozMin.adicionarFuncionario("Marcos", "Cozinheiro");
    cozMin.adicionarFuncionario("Fernanda", "Gerente");
    cozMin.adicionarFuncionario("Manoela", "Atendente");



  //cozMin.ingredientes.forEach(item->System.out.println(item.dataValidade));
    
  Cozinha cozChi = new Cozinha(15,Cozinha.Origem.Chinesa, 1, 50, 13, 22, "Yakissoba");
    cozChi.acrescentarIngredientes("Cebola", LocalDate.of(2021, 05,14));
    cozChi.acrescentarIngredientes("Brócolis", LocalDate.of(2021, 05,04));
    cozChi.acrescentarIngredientes("Couve-flor", LocalDate.of(2021, 04,04));
    cozChi.acrescentarIngredientes("Carne Alcatara", LocalDate.of(2021, 04,05));
    cozChi.acrescentarIngredientes("Champignon", LocalDate.of(2021, 04,01));

    cozChi.adicionarFuncionario("Thai", "Garçon");
    cozChi.adicionarFuncionario("Makai", "Sushimam");
    cozChi.adicionarFuncionario("Mogi", "Gerente");
    cozChi.adicionarFuncionario("Kai", "Atendente");


  Cozinha cozIt = new Cozinha(15,Cozinha.Origem.Italiana, 1, 50, 13, 22, "Macarronada");
    cozIt.acrescentarIngredientes("Molho", LocalDate.of(2021, 05,14));
    cozIt.acrescentarIngredientes("Farinha", LocalDate.of(2021, 04,01));
    cozIt.acrescentarIngredientes("Arroz", LocalDate.of(2021, 04,04));
    cozIt.acrescentarIngredientes("Macarrão", LocalDate.of(2021, 04,05));
    cozIt.acrescentarIngredientes("Linguiça", LocalDate.of(2021, 04,10));

    cozIt.adicionarFuncionario("Paulo", "Garçon");
    cozIt.adicionarFuncionario("Lucas", "Cozinheiro");
    cozIt.adicionarFuncionario("Edimar", "Gerente");
    cozIt.adicionarFuncionario("Joaquim", "Atendente");

  Cozinha cozAl = new Cozinha(7,Cozinha.Origem.Alema, 1, 60, 12, 23, "Königsberger Klopse");
    cozAl.acrescentarIngredientes("anchovas", LocalDate.of(2021, 05,01));
    cozAl.acrescentarIngredientes("alcaparras", LocalDate.of(2021, 04,01));
    cozAl.acrescentarIngredientes("creme de leite", LocalDate.of(2021, 04,01));
    cozAl.acrescentarIngredientes("carne moída", LocalDate.of(2021, 04,01));
    cozAl.acrescentarIngredientes("Suco de um limão", LocalDate.of(2021, 04,01));

    cozAl.adicionarFuncionario("Paulo", "Garçon");
    cozAl.adicionarFuncionario("Lucas", "Cozinheiro");
    cozAl.adicionarFuncionario("Edimar", "Gerente");
    cozAl.adicionarFuncionario("Joaquim", "Atendente");

  System.out.println("Escolha um de nossos tipos de culinária");
  System.out.println("1 - Mineira, 2 - Italiana, 3 - Chinesa, 4 - Alemã, 5 - Sair");

  Scanner entrada = new Scanner(System.in);
  int opcoes = entrada.nextInt();
  
  
  while (opcoes != 5) {
    switch (opcoes)
    {
      case 1: 
        System.out.printf("Restaurante Mineiro:  \n" +"\n" + cozMin + "\n");
        break;
      case 2: 
        System.out.printf("Restaurante Italiano: \n" + "\n" + cozIt + "\n");
        break;
      case 3:
        System.out.printf("Restaurante Chinês: \n" +"\n" + cozChi + "\n");
        break;
      case 4:
        System.out.printf("Restaurante Alemão: \n" +"\n" + cozAl + "\n");
        break;
      case 5:
        
        break;
      default:
        break;
    
    }
   
   System.out.println("1 - Mineira, 2 - Italiana, 3 - Chinesa, 4 - Alemã, 5 - Sair");
   System.out.println("Escolha um de nossos tipos de culinária: ");
   opcoes = entrada.nextInt();
   //Limpa a tela no windows, no linux e no MacOS
   if (System.getProperty("os.name").contains("Windows"))
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    else
      Runtime.getRuntime().exec("clear");
    }

 entrada.close();
 System.out.println("Obrigado por nos visitar. Volte Sempre!!: ");



  


  // System.out.println("\n");
  // System.out.println(cozAl);
  // System.out.println("\n");
  // System.out.println(cozIt);
  // System.out.println("\n");
  // System.out.println(cozChi);
  // System.out.println("\n");
  // System.out.println(cozMin);
  // System.out.println("\n");

  

  }
}