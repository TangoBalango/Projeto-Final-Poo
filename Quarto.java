public class Quarto {
    private int numero;
    private String tipo;
    private double preco;
    private boolean disponivel;

    public Quarto(int numero, String tipo, double preco, boolean disponivel){
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
        this.disponivel = true;
    }

    public int getNumero(){
        return numero;
    }
    public String getTipo(){
        return tipo;
    }
    public double getPreco(){
        return preco;
    }
    public boolean isdisponivel(){
        return disponivel;
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }






}
