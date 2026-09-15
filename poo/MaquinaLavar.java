public class MaquinaLavar{

    private boolean ligar;
    private boolean abrir;
    private boolean centrifuga;
    private boolean pausa;


public MaquinaLavar(){
    this.ligar = false;
    this.abrir = false;
    this.centrifuga = false;
    this.pausa = false; 
}
public void ligar(){
    if(abrir){
        System.out.println("Porta aberta, não é possível ligar a máquina");
        return;
    }


    if(!ligar){
        ligar = true;
        System.out.println("Máquina ligada");
    } else {
        System.out.println("Máquina já está ligada");
    }
} 

public void desligar(){
    if(ligar){
        ligar = false;
        System.out.println("Máquina desligada");
    } else {
        System.out.println("Máquina já está desligada");
    }
}

public void abrir(){

    if(ligar){
        System.out.println("Máquina ligada, não é possível abrir a porta");
        return;
    }

    if (!abrir){
        abrir = true;
        System.out.println("Porta aberta");
    } else {
        System.out.println("Porta já está aberta");
    }
}
public void fechar(){
    if (abrir){
        abrir = false;
        System.out.println("Porta fechada");
    } else {
        System.out.println("Porta já está fechada");
    }
}

public void centrifugar(){
    if (!ligar){
        System.out.println("Máquina desligada, não é possível centrifugar");
        return;
    }
    if(!centrifuga){
        
        centrifuga = true;
        System.out.println("Centrifugando");
    } else {
        System.out.println("Máquina já está centrifugando");
    
    }
    
    if (centrifuga){
        centrifuga = false;
        System.out.println("Centrifugando finalizado");
    } else {
        System.out.println("Máquina não está centrifugando");
    
    }

}

public void pausar(){
    
    if (!ligar){
        System.out.println("Máquina desligada, não é possível pausar");
        return;
    }
    if(!pausa){
        
        pausa = true;
        System.out.println("Máquina pausada");
    } else {
        System.out.println("Máquina já está pausada");
    
    }
}
public void retomar(){
    
    if (!ligar){
        System.out.println("Máquina desligada, não é possível retomar");
        return;
    }
    if(pausa){
        
        pausa = false;
        System.out.println("Máquina retomada");
    } else {
        System.out.println("Máquina já está em funcionamento");
    
    }
}
}










    
