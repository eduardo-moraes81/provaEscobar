
public class ApoliceVida implements Apolice {
    private double capitalSegurado;

    public ApoliceVida(double capitalSegurado) {
        this.capitalSegurado = capitalSegurado;
    }

    @Override
    public String pegarLinhaDoProduto() 
    { 
        return String.valueOf("Vida"); 
    }

    @Override
    public double calcularPremioMensal() 
    { 
        return (capitalSegurado * 0.03) / 12; 
    }

    @Override
    public String pegarDocumentosExigidos() 
    { 
        return String.valueOf("Documento de identidade e CPF"); 
    }
}