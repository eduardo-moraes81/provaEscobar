public class MainQ1 
{
    public static void main(String[] args) {
        EmissorApolice emissorAuto = new EmissorAuto();
        emissorAuto.emitirApolice("João Silva", 50000.0);

        EmissorApolice emissorResidencial = new EmissorResidencial();
        emissorResidencial.emitirApolice("Maria Oliveira", 300000.0);

        EmissorApolice emissorVida = new EmissorVida();
        emissorVida.emitirApolice("Carlos Souza", 100000.0);
    }
}