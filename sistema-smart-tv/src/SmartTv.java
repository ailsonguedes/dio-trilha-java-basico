public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    

    public void volSum(){
        volume = volume + 1;
    }
    public void volSub(){
        volume = volume - 1;
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    
}
