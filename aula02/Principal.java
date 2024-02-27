import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        

        Carro car = new Carro();
       // mt.monstruario();

       String m = JOptionPane.showInputDialog("Qual a marca da moto");
       String model = JOptionPane.showInputDialog("Qual o model que deseja?");
       String an = JOptionPane.showInputDialog("Insira o ano");
       String vl = JOptionPane.showInputDialog("Insira o valor");

       JOptionPane.showMessageDialog(null, car.venda(m, model, an, vl));


    }
    
}
