import java.util.ArrayList;
import java.util.List;

public class Vertice {

    private String nome;

    // SAÍDA → para onde o vértice aponta
    private List<Vertice> adjacencias;

    // ENTRADA → quem aponta para esse vértice
    private List<Vertice> adjacentes;

    public Vertice(String nome) {
        this.nome = nome;
        this.adjacencias = new ArrayList<>();
        this.adjacentes = new ArrayList<>();
    }

    // ================================
    // RELACIONAMENTOS
    // ================================

    // A → B (saída)
    public void adicionarAdjacencia(Vertice destino) {
        adjacencias.add(destino);
    }

    // B recebe de A (entrada)
    public void adicionarAdjacente(Vertice origem) {
        adjacentes.add(origem);
    }

    // ================================
    // GRAUS
    // ================================

    public int getOutDegree() {
        return adjacencias.size();
    }

    public int getInDegree() {
        return adjacentes.size();
    }

    public int getGrauTotal() {
        return getInDegree() + getOutDegree();
    }

    // ================================
    // GETTERS
    // ================================

    public String getNome() {
        return nome;
    }

    public List<Vertice> getAdjacencias() {
        return adjacencias;
    }

    public List<Vertice> getAdjacentes() {
        return adjacentes;
    }
}