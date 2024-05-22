import java.util.LinkedList;
import java.util.List;

public class MedicionPredecirLinkedList extends Medible{
    private LinkedList<String> linkedList;

    public MedicionPredecirLinkedList(LinkedList linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public void ejecutar(Object... args) {
        if (args.length < 1 || !(args[0] instanceof String)) {
            throw new IllegalArgumentException("Se requiere una cadena de entrada para la función autocompletar");
        }

        String input = (String) args[0];
        List<String> results = new LinkedList<>();

        for (String element : linkedList) {
            if (element.startsWith(input)) {
                results.add(element);
            }
        }
           
    }
    
    @Override
    public Object getObjetoAMedirMemoria() {
        return this.linkedList;
    }
}
