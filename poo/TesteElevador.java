public class TesteElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(1);
       
        elevador.abrirPorta();
        elevador.fecharPorta();
        elevador.subir();
        elevador.abrirPorta();
    }
}