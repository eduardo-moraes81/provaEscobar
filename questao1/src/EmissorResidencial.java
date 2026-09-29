public class EmissorResidencial extends EmissorApolice {

    @Override
    protected Apolice criarApolice(double valorBase) 
    { 
        return new ApoliceResidencial(valorBase);
    }
}