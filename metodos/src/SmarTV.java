public class SmarTV {
   public boolean ligado = false;
   public int canal = 1;
   public int volume = 25;

public void ligarTV() {
   ligado = true;
}

public void desligarTV() {
   ligado = false;
}

public void aumentarVolume() {
   volume++;
}

public void diminuteVolume() {
   volume--;
}

public void definirCanal(int novoCanal) {
   canal = novoCanal;
}

public void subirCanal() {
   canal++;
}

public void descerCanal() {
   canal--;
}

}
