import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Lista
        List <String> listaNomes = new ArrayList<String>();
        listaNomes.add("Thales");
        listaNomes.add("Ana");
        listaNomes.add("Pedro");
        listaNomes.add("Evandro");
        listaNomes.add("Maria Clara");
        listaNomes.add("Leo");

        List<Double> listaDouble = new ArrayList<Double>();

        for (int i = 0; i < 6; i++) {
            listaDouble.add(new Random().nextDouble()*10000);
        }

        Funcionario garçom = new Garçom(listaNomes.get(0), listaDouble.get(0));
        Funcionario garçom2 = new Garçom(listaNomes.get(1), listaDouble.get(1));
        Funcionario faxineiro = new Faxineiro(listaNomes.get(2), listaDouble.get(2));
        Funcionario faxineiro2 = new Faxineiro(listaNomes.get(3), listaDouble.get(3));
        Funcionario chef = new Chef(listaNomes.get(4), listaDouble.get(4));
        Funcionario chef2 = new Chef(listaNomes.get(5), listaDouble.get(5));

        System.out.println("Antes de ordenar: \n");

        for (Double double1 : listaDouble) {
            System.out.println("Salário: R$" + double1);
        }

        System.out.println(" \n ------------------------ \n");
        System.out.println("Depois de ordenar: \n");

        Collections.sort(listaDouble, Collections.reverseOrder());

        for (Double double1 : listaDouble) {
            System.out.println("Salário: R$" + double1);
        }

        System.out.println("\n");

        List <Funcionario> listaFuncionarios = new ArrayList();
        listaFuncionarios.add(garçom);
        listaFuncionarios.add(garçom2);
        listaFuncionarios.add(faxineiro);
        listaFuncionarios.add(faxineiro2);
        listaFuncionarios.add(chef);
        listaFuncionarios.add(chef2);

        for (Funcionario funcionarios : listaFuncionarios){
            System.out.println("-------------------------");
            System.out.println("Dados do funcionário: \n");
            System.out.println("Nome: " + funcionarios.nome);
            System.out.println("Salário: " + funcionarios.salario);
            System.out.println("\n");
        }

    }
}