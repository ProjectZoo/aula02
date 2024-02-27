import javax.swing.JOptionPane;

public class Moto extends Auto implements IVenda {
    public void monstruario(){
        this.setMarca("Honda");
        this.setModelo("CBR900");
        this.setAno("2024");

        JOptionPane.showMessageDialog(null,
                "Marca: " + this.getMarca() +
                "\n Modelo: " + this.getModelo() +
                "\n Ano: " + this.getAno()
        
        
        );
        
    }

    @Override  
    public String venda(String marca, String modelo, String ano, String valor) {

        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setValor(valor);

        String dados = "A marca escolhida é: " + this.getMarca() +
                        "\n o modelo é: " + this.getModelo() +
                        "\n o ano é: " + this.getAno() +
                        "\n o valor é: " + this.getValor() ;

        return dados;

    }

    @Override
    public String compra() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compra'");
    }

    @Override
    public String troca() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'troca'");
    }
}
