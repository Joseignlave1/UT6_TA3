import java.util.LinkedList;

public class MedicionPredecirTrie extends Medible{
    private TArbolTrie trie;
    private LinkedList<String> listaPalabras;



    public MedicionPredecirTrie(TArbolTrie trie) {
        this.trie = trie;
        this.listaPalabras = new LinkedList<>();
    }

    @Override
    public void ejecutar(Object... params) {
        int repeticion = (int) params[0];
        String[] palabras = (String[]) params[1];
        for (int i = 0; i < repeticion; i++) {
            for (String palabra : palabras) {
                trie.getRaiz().predecir(palabra,listaPalabras);
            }
        }

    }

    @Override
    public Object getObjetoAMedirMemoria() {
        return this.trie;
    }
}
