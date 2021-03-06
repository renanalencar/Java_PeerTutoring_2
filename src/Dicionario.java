import java.util.ArrayList;

/**
 * Dicionario
 */
public class Dicionario<K, V> {
    
    private ArrayList<K> chaves;
    private ArrayList<V> valores;

    public Dicionario() {
        chaves = new ArrayList<>();
        valores = new ArrayList<>();
    }

    public void adiciona(K chave, V valor) {
        this.chaves.add(chave);
        this.valores.add(valor);
    }

    public V retorna(K chave) {
        V temp = null;
        int indice = chaves.indexOf(chave);
        temp = valores.get(indice);
        return temp; 
    }

    
}