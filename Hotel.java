import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private String Localizacao;
    private List<Quarto> quartos;

public Hotel(String nome, String localizacao){
    this.nome = nome;
    this.Localizacao = localizacao;
    this.quartos = new ArrayList<>();
}

public void adicionarQuarto(Quarto quarto){
    quartos.add(quarto);
}
public void removerQuarto(Quarto quarto){
    quartos.remove(quarto);
}

public List<Quarto> buscarQuartosDisponiveis(String tipo){
    List<Quarto> disponiveis = new ArrayList<>();
    for(Quarto q : quartos){
        if(q.isdisponivel() && q.getTipo().equalsIgnoreCase(tipo)){
            disponiveis.add(q);
        }
    }
    return disponiveis;
}



}
