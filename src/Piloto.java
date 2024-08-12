import javax.swing.JOptionPane;

public class Piloto {
    public static void main(String[] args) throws Exception {
        double n1, n2, n3, maior;
/**PRIMEIRO METODO */
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        n2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));

        ExemplosSobrecarga e1 = new ExemplosSobrecarga();
        maior = e1.calcularNumeroMaior(n1, n2);
        if (maior == 0) {
            JOptionPane.showMessageDialog(null, "Os números digitados são iguais.");
        } else {
            JOptionPane.showMessageDialog(null, "Maior número digitado: " + maior);
        }
        
    

/**SEGUNDO METODO */
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        n2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
        n3=Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro numero: "));

        ExemplosSobrecarga e2 = new ExemplosSobrecarga();
        maior = e2.calcularNumeroMaior(n1, n2, n3);

        if (maior == 0) {
            JOptionPane.showMessageDialog(null, "Os números digitados são iguais.");
        } else {
            JOptionPane.showMessageDialog(null, "Maior número digitado: " + maior);
        }
    }   
}


