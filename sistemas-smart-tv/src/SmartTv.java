public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
    public void mudarcanal(int novoCanal) {
        canal = novoCanal;
    }
    public void aumentarVolume() {
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }
    public void diminuirvolume() {
        volume--;
        System.out.println("Volume diminuido para: " + volume);
    }
}