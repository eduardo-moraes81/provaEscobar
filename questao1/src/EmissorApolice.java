public abstract class EmissorApolice {

    protected abstract Apolice criarApolice(double valorBase);

    public void emitirApolice(String nomeSegurado, double valorBase) {
        Apolice apolice = criarApolice(valorBase);
        
        System.out.println("--- Resumo---");
        System.out.println("Linha de Produto: " + apolice.pegarLinhaDoProduto());
        System.out.println("Segurado: " + nomeSegurado);
        System.out.printf("Prêmio Mensal: R$ %.2f\n", apolice.calcularPremioMensal());
        System.out.println("Documentos Exigidos: " + apolice.pegarDocumentosExigidos());
        System.out.println("-------------------------\n");
    }
}