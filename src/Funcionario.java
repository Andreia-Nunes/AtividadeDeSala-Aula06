public class Funcionario {

//Atributos:
    private int id;
    private String nome;
    private String email;
    private double salario;


//Construtor:
    public Funcionario(int id, String nome, String email, double salario){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }


//Métodos:

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setEmail(String novoEmail){
        this.email = novoEmail;
    }

    public void aumentarSalario(double percentual){
        this.salario += this.salario * percentual / 100.0;
    }
}
