import java.util.Date;


public class Reserva {
    private Cliente cliente;
    private Quarto quarto;
    private Date checkIn;
    private Date checkOut;

    public Reserva(Cliente cliente, Quarto quarto, Date checkIn, Date checkOut){
        this.cliente = cliente;
        this.quarto = quarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

 public Quarto getQuarto(){
    return quarto;
 }
 public Cliente getCliente(){
    return cliente;
 }
 public Date getCheckIn(){
    return checkIn;
 }
 public Date getCheckOut(){
    return checkOut;
 }



}
