import java.util.Date;

public class Recepicionista extends Funcionario {
    public Recepicionista(String nome, String email){
        super(nome, email);
    }

    public void adicionarQuarto(Hotel hotel, Quarto quarto){
        hotel.adicionarQuarto(quarto);
    }
    public void removerQuarto(Hotel hotel, Quarto quarto){
        hotel.removerQuarto(quarto);
    }
    public void CriarReserva(Cliente cliente, Quarto quarto, Date checkIn, Date checkOut){
        Reserva reserva = new Reserva(cliente, quarto, checkIn, checkOut);
        cliente.adicionarReserva(reserva);
        quarto.setDisponivel(false);
    }

}
