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
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>();
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
       /*Set<LocalDate> dateSet = eventosMap.keySet();
       Collection<Evento> values = eventosMap.values();*/

       /* eventosMap.get()
       */

      LocalDate dataAtual = LocalDate.now();
      LocalDate proximaData = null;
      Evento proximoEvento = null;
      Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>();

      for (Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()){
        if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
            proximaData = entry.getKey();
            proximoEvento = entry.getValue();
            System.out.println("O próximo evento: " + entry.getValue() + "acontecerá na data: " + entry.getKey());
            break;
        }
      }
    }
}
