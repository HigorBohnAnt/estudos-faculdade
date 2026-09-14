public class Elevador {

    private boolean aberta;
    private int andarAtual;
    private int totalAndares;
    private int subir;
    private int descer;

    public Elevador(int totalAndares){
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.aberta = false;
    }

    public void abrirPorta(){
        if(!aberta){
            aberta = true;
            System.out.println("Porta aberta");
        } else {
            System.out.println("Porta já está aberta");
        }
    }

    public void fecharPorta(){
        if(aberta){
            aberta = false;
            System.out.println("Porta fechada");
        } else {
            System.out.println("Porta já está fechada");
        }
    }

    public int subir(){
        if(aberta){
            System.out.println("Porta aberta, não é possível subir");
            return andarAtual;
        }

        if(andarAtual < totalAndares){
            andarAtual ++;
            System.out.println("Subindo para o andar " + andarAtual);
            return andarAtual;
        } else {
            System.out.println("Já está no último andar");
            return andarAtual;
        }
        
    }
        public int descer(){
            if(aberta){
            System.out.println("Porta aberta, não é possível descer");
            return andarAtual;
        }

        if(andarAtual > 0){
            andarAtual --;
            System.out.println("Descendo para o andar " + andarAtual);
            return andarAtual;
        } else {
            System.out.println("Já está no térreo");
            return andarAtual;
        }
    }
}

