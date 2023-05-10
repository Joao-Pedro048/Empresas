public class Empregado {
    private String nome;
    protected float salario;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
       return "Nome do Funcionário: " + getNome() + "\n" + "Salário: " + salario;
    }
    
}