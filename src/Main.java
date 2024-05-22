import java.util.*;

public class Main {

    private static final int REPETICIONES = 100;

    public static void main(String[] args) {
        TArbolTrie arbolTrie = new TArbolTrie();
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        String[] palabrasclave = ManejadorArchivosGenerico.leerArchivo("./src/listado-general_desordenado.txt");
        String[] palabrasBuscar = ManejadorArchivosGenerico.leerArchivo("./src/listado-general_palabrasBuscar.txt");
        for (String p : palabrasclave) {
            // insertar la palabra p en el trie
            // insertar la palabra p en el linkedList
            // insertar la palabra p en el arrayList
            // insertar la palabra p en el hashMap
            // insertar la palabra p en el treeMap
            arbolTrie.insertar(p);
            linkedList.add(p);
            arrayList.add(p);
            hashMap.put(p, p);
            treeMap.put(p, p);
        }
        Medible[] medibles = new Medible[6];
        int i = 0;

        medibles[i++] = new MedicionBuscarLinkedList(linkedList);
        medibles[i++] = new MedicionBuscarArrayList(arrayList);
        medibles[i++] = new MedicionBuscarTrie(arbolTrie);
        medibles[i++] = new MedicionBuscarHashMap(hashMap);
        medibles[i++] = new MedicionBuscarTreeMap(treeMap);

        medibles[i++] = new MedicionPredecirHashMap(hashMap);

        Medicion mi;
        i = 0;
        // String prefijo = "cas";
        Object[] params = { REPETICIONES, palabrasBuscar };
        String[] lineas = new String[7];
        lineas[i++] = "algoritmo,tiempo,memoria";
        for (Medible m : medibles) {
            mi = m.medir(params);
            mi.print();
            lineas[i++] = mi.getTexto() + "," + mi.getTiempoEjecucion().toString() + ","
                    + mi.getMemoria().toString();

        }

        ManejadorArchivosGenerico.escribirArchivo("./src/salida.csv", lineas);

        // arbolTrie.insertar("prediccion");
        // arbolTrie.insertar("predecir");
        // arbolTrie.insertar("presente");
        // arbolTrie.insertar("presionar");

        // LinkedList<String> predicciones = arbolTrie.predecir("pre");
        // for (String palabra : predicciones) {
        // System.out.println(palabra);
        // }
    }
}