public class EmissorVida extends EmissorApolice {
    
    @Override
    protected Apolice criarApolice(double valorBase) 
    { 
        return new ApoliceVida(valorBase); 
    }
}