public class Carro extends Auto implements IVenda {

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