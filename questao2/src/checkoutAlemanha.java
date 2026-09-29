public class checkoutAlemanha {
    public static void main(String[] args) {
        DocumentoFiscal notaFiscal = new NotaFiscalAlemanha();
        System.out.println(notaFiscal.gerar());

        Pagamento pagamento = new TransferenciaBancaria();
        System.out.println(pagamento.processar());

        EtiquetaEnvio etiqueta = new EtiquetaDHL();
        System.out.println(etiqueta.imprimir());
    }
}