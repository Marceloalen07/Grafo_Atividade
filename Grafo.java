import java.util.ArrayList;
import java.util.List;

public class Grafo {

    private List<Vertice> vertices;
    private int tamanho; // número de arestas

    public Grafo() {
        vertices = new ArrayList<>();
        tamanho = 0;
    }

    // ================================
    // VÉRTICES
    // ================================

    public void adicionarVertice(String nome) {
        Vertice v = new Vertice(nome);
        vertices.add(v);
    }

    public Vertice buscarVertice(String nome) {
        for (Vertice v : vertices) {
            if (v.getNome().equals(nome)) {
                return v;
            }
        }
        return null;
    }

    public List<Vertice> getVertices() {
        return vertices;
    }

    // ================================
    // ARESTAS (DIRECIONADAS)
    // ================================

    public void adicionarAresta(String origem, String destino) {
        Vertice vOrigem = buscarVertice(origem);
        Vertice vDestino = buscarVertice(destino);

        if (vOrigem != null && vDestino != null) {
            vOrigem.adicionarAdjacencia(vDestino); // saída
            vDestino.adicionarAdjacente(vOrigem);  // entrada
            tamanho++;
        } else {
            System.out.println("Erro: vértice não encontrado.");
        }
    }

    // ================================
    // INFORMAÇÕES DO GRAFO
    // ================================

    public int getOrdem() {
        return vertices.size();
    }

    public int getTamanho() {
        return tamanho;
    }
}