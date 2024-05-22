import java.util.HashMap;

public class MedicionBuscarHashMap extends Medible {
    private HashMap hashmap;

    public MedicionBuscarHashMap(HashMap hashMap) {
        this.hashmap = hashMap;
    }

    @Override
    public void ejecutar(Object... params) {
        int repeticion = (int) params[0];
        String[] palabras = (String[]) params[1];
        for (int i = 0; i < repeticion; i++) {
            for (String palabra : palabras) {
                hashmap.containsKey(palabra);
            }
        }
    }

    @Override
    public Object getObjetoAMedirMemoria() {
        return this.hashmap;
    }
}
