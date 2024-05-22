import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MedicionPredecirHashMap extends Medible {
    private HashMap<String, String> hashMap;

    public MedicionPredecirHashMap(HashMap<String, String> hashMap) {
        this.hashMap = hashMap;

    }

    @Override
    public void ejecutar(Object... params) {
        int repeticion = (int) params[0];
        String prefijo = (String) params[1];
        for (int i = 0; i < repeticion; i++) {
            LinkedList<String> resultados = predecir(prefijo);
            System.out.println(resultados);
        }
    }

    // Metodo para predecir en un hashMap
    private LinkedList<String> predecir(String prefijo) {
        LinkedList<String> resultados = new LinkedList<>();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (entry.getKey().startsWith(prefijo)) {
                resultados.add(entry.getKey());
            }
        }
        return resultados;
    }

    @Override
    public Object getObjetoAMedirMemoria() {
        return this.hashMap;

    }

}
