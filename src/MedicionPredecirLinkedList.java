import java.util.LinkedList;
import java.util.List;

public class MedicionPredecirLinkedList extends Medible{
    private LinkedList<String> linkedList;

    public MedicionPredecirLinkedList(LinkedList linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public void ejecutar(Object... params) {
        int repeticion = (int) params[0];
        String prefijo = (String) params[1];

        for (int i = 0; i < repeticion; i++) {
                autocompletar(prefijo);
        }
    }

    private List<String> autocompletar(String prefijo) {
        List<String> resultados = new LinkedList<>();
        for (String palabra : linkedList) {
            if (palabra.startsWith(prefijo)) {
                resultados.add(palabra);
            }
        }
        return resultados;
    }
    
    @Override
    public Object getObjetoAMedirMemoria() {
        return this.linkedList;
    }
}
