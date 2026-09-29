public class NFe implements DocumentoFiscal
{
    public String gerar() { return "NF-e gerada com ICMS de 18%"; }
}
public class Pix implements Pagamento
{
    public String processar() { return "Pagamento via Pix processado"; }
}
public class EtiquetaCorreios implements EtiquetaEnvio
{
    public String imprimir() { return "Etiqueta dos Correios gerada"; }
}