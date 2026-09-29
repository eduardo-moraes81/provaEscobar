
public class ApoliceAuto implements Apolice {
    private double valorVeiculo;

    public ApoliceAuto(double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }

    @Override
    public String pegarLinhaDoProduto() 
    { 
        return String.valueOf("Auto"); 
    }

    @Override
    public double calcularPremioMensal() 
    { 
        return (valorVeiculo * 0.08) / 12; 
    }

    @Override
    public String pegarDocumentosExigidos() 
    { 
    return String.valueOf("CNH E CRLV"); 
    }

}