public class EmissorAuto extends EmissorApolice {

    @Override
    protected Apolice criarApolice(double valorBase)
    { 
        return new ApoliceAuto(valorBase); 
    }
}