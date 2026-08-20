import javax.swing.JOptionPane;
public class Exercicio5{
  public static void main(String args []){
    //float(4 bytes), double(8 bytes)
    float media = Float.parseFloat(
      JOptionPane.showInputDialog("Digite a média")
    );
    String situacao;
    //if/else encadeado
    if(media >= 6)
      situacao = "Aprovado";
    else if(media >= 4)
      situacao = "Recuperação";
    else
      situacao = "Reprovado"; 
    JOptionPane.showMessageDialog(
      null,
      "O aluno está: " + situacao
    );
  }
}