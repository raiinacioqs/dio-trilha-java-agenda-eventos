
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        
        AgendaEventos eventos = new AgendaEventos();

        eventos.adicionarEvento(LocalDate.of(2025, 9, 15), "Evento 1", "Atração 1");
        eventos.adicionarEvento(LocalDate.of(2025, 12, 12),"Evento 2", "Atração 2");
        eventos.adicionarEvento(LocalDate.of(2000, 3, 9),"Evento 3", "Atração 3");
        eventos.adicionarEvento(LocalDate.of(2025, 10, 3),"Evento 4", "Atração 4");
        eventos.adicionarEvento(LocalDate.of(2025, 10, 4),"Evento 5", "Atração 5");
        
        eventos.exibirAgenda();
        eventos.obterProximoEvento();

    }
}
