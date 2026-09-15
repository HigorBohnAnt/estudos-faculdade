public class TesteMaquinaLavar {
    public static void main(String[] args) {
        MaquinaLavar maquina = new MaquinaLavar();
       
        maquina.abrir();
        maquina.fechar();
        maquina.ligar();
        maquina.pausar();
        maquina.retomar();
        maquina.centrifugar();
        maquina.abrir();
    }
}
