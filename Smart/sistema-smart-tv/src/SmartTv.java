public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void mudarCanalMaior(){
        canal++;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void mudarCanalMenor(){
        canal--;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
}

