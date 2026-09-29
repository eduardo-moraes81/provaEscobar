public class ApoliceResidencial implements Apolice {
    private double valorImovel;

    public ApoliceResidencial(double valorImovel) {
        this.valorImovel = valorImovel;
    }

    @Override
    public String pegarLinhaDoProduto() 
    {
        return String.valueOf("Residencial"); 
    }

    @Override
    public double calcularPremioMensal() 
    {
        return String.valueOf(valorImovel * 0.015) / 12;
    }

    @Override
    public String pegarDocumentosExigidos() 
    {
        return String.valueOf("Comprovante de residência, RG e CPF");
    }
}
