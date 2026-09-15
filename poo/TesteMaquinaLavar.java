public class TesteMaquinaLavar {
    public static void main(String[] args) {
        MaquinaLavar maquina = new MaquinaLavar();
       
        maquina.ligar();
        maquina.lavagem();
        maquina.pausar();
        maquina.retomar();
        maquina.finalizarLavagem();
        maquina.centrifugar();
        maquina.finalizarCentrifugacao();
        maquina.desligar();

    }
}
