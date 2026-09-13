public class TesteElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(20);
       
        elevador.abrirPorta();
        elevador.subir();
        elevador.fecharPorta();
        elevador.subir();
    }
}