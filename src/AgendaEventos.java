import java.time.LocalDate;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class AgendaEventos {
    
    public Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
        
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
       /*Set<LocalDate> dateSet = eventosMap.keySet();
       Collection<Evento> values = eventosMap.values();*/

       /* eventosMap.get()
       */

      LocalDate dataAtual = LocalDate.now();
      Evento proximoEvento = null;
      LocalDate proximaData;
      Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

      for (Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()){
        if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
            proximoEvento = entry.getValue();
            proximaData = entry.getKey();
            System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data: " + proximaData);
            break;
        }
      }
      
      if (proximoEvento == null) {
          System.out.println("Não há próximos eventos agendados.");
      }
    }
}
