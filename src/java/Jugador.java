public class Jugador {
    private int jugadaGanada;
    
    
    public Jugador (){
    }

    public int getJugadaGanada() {
        return jugadaGanada;
    }

    public void setJugadaGanada(int jugadaGanada) {
        this.jugadaGanada = jugadaGanada;
    }
    
    public void aumentaPuntajeGanado(){
        jugadaGanada++;
    }
    
    public void aumentaValor(int valor){
    
    jugadaGanada += valor;
    
    }
    
    
    
}

