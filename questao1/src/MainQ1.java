public class MainQ1 
{
    public static void main(String[] args) {
        EmissorApolice emissorAuto = new EmissorAuto();
        emissorAuto.emitirApolice("jaozin da rua de baixo", 50000.0);

        EmissorApolice emissorResidencial = new EmissorResidencial();
        emissorResidencial.emitirApolice("duardo da rua de cima", 300000.0);

        EmissorApolice emissorVida = new EmissorVida();
        emissorVida.emitirApolice("guizin jabulane", 100000.0);
    }
}