public class Main {

    public static void main(String[] args) {

        Grafo g = new Grafo();

        // ================================
        // 10 VÉRTICES
        // ================================
        g.adicionarVertice("A");
        g.adicionarVertice("B");
        g.adicionarVertice("C");
        g.adicionarVertice("D");
        g.adicionarVertice("E");
        g.adicionarVertice("F");
        g.adicionarVertice("G");
        g.adicionarVertice("H");
        g.adicionarVertice("I");
        g.adicionarVertice("J");

        // ================================
        // ARESTAS
        // ================================
        g.adicionarAresta("A", "B");
        g.adicionarAresta("A", "C");
        g.adicionarAresta("B", "D");
        g.adicionarAresta("C", "D");
        g.adicionarAresta("D", "E");
        g.adicionarAresta("E", "F");
        g.adicionarAresta("F", "G");
        g.adicionarAresta("G", "H");
        g.adicionarAresta("H", "I");
        g.adicionarAresta("I", "J");
        g.adicionarAresta("J", "A"); // ciclo
        g.adicionarAresta("C", "F");
        g.adicionarAresta("B", "G");
        g.adicionarAresta("E", "I");

        // ================================
        // ORDEM E TAMANHO
        // ================================
        System.out.println("Ordem do grafo: " + g.getOrdem());
        System.out.println("Tamanho do grafo: " + g.getTamanho());

        // ================================
        // DETALHES DOS VÉRTICES
        // ================================
        for (Vertice v : g.getVertices()) {

            System.out.println("\n========================");
            System.out.println("Vértice: " + v.getNome());

            // SAÍDA
            System.out.print("Adjacências (saída): ");
            for (Vertice x : v.getAdjacencias()) {
                System.out.print(x.getNome() + " ");
            }

            // ENTRADA
            System.out.print("\nAdjacentes (entrada): ");
            for (Vertice x : v.getAdjacentes()) {
                System.out.print(x.getNome() + " ");
            }

            // GRAUS
            System.out.println("\nIn-degree: " + v.getInDegree());
            System.out.println("Out-degree: " + v.getOutDegree());
            System.out.println("Grau total: " + v.getGrauTotal());
        }
    }
}