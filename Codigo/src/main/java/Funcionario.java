public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void mostraInfo(){
        System.out.println("-------------------------");
        System.out.println("Dados do funcionário: \n");
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
    }
}