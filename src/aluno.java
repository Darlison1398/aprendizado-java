public class aluno {
    private String nome;
    private int idade;
    private int nota1;
    private int nota2;

    public aluno(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public void materiasCursadas(){
        String[] materias = {"Java", "Html", "Css"};
        for (int i = 0; i< materias.length; i++){
            System.out.println(materias[i]);
        }
        return;
    }

    public String mostrar(){
        return "Nome: "+ nome + "\nIdade: "+ idade + "\nPrimeira nota: "+ nota1+
                "\nSegunda nota: "+ nota2 ;
    }
}
