import java.util.HashMap;
import java.util.LinkedList;

public class MedicionPredecirLinkedList extends Medible{
    private LinkedList linkedList;

    public MedicionPredecirLinkedList(LinkedList linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public void ejecutar(Object... args) {
        int repeticion = (int) args[0];
        int[] indices = (int[]) args[1];
        for(int i = 0; i < repeticion; i++){
            for(int indice : indices){
                linkedList.get(indice);
            }
        }
    }
    
    @Override
    public Object getObjetoAMedirMemoria() {
        return this.linkedList;
    }
}
