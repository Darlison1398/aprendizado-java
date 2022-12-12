import javax.swing.*;

public class area {
    public static void main(String[] args){
        System.out.println("Apresentação das notas d um aluno");

        aluno al = new aluno();

        al.setNome(JOptionPane.showInputDialog("Nome do aluno"));
        al.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do aluno")));
        al.setNota1(Integer.parseInt(JOptionPane.showInputDialog("Primeira nota")));
        al.setNota2(Integer.parseInt(JOptionPane.showInputDialog("Segunda nota")));

        System.out.println(al.mostrar());
        System.out.println("Matérias cursadas pelo aluno");
        al.materiasCursadas();

        media(al.getNota1(), al.getNota2());

    }

    static void media(float x, float y){
        System.out.println("A média do aluno é "+ (x + y)/2);
    }

}
