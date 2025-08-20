import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private List<Reserva> reservas;
     
    public Cliente(String nome, String email){
        super(nome, email);
        this.reservas = new ArrayList<>();
    }

public void adicionarReserva(Reserva reserva){
    reservas.add(reserva);
}

public void cancelarReserva(Reserva reserva){
    reservas.remove(reserva);
}

public List<Reserva> getReservas(){
    return reservas;
}






}
