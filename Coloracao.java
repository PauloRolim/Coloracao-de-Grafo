import java.util.ArrayList;
import java.util.List;

public class Coloracao {

    /**
     * Função responsavel por retornar a adjacencia entre dois vertices.
     * @param linha
     * @param grafo
     * @return uma aresta ou adjacencia
     */

    public List<Integer> getAdjacentes(int linha, int grafo[][]) {
        List<Integer> adj = new ArrayList<Integer>();
        for (int i = 0; i < grafo.length; i++) {
            if (grafo[linha][i] == 1) {
                adj.add(i);
            }
        }
        return adj;
    }

    /**
     * Retorna a cor do vertice 
     * @param v
     * @param vertices
     * @return a cor de um vértice
     */
    public char getCor(int v, char[] vertices) {
        return vertices[v];
    }

    /** 
     * Função de coloração do grafo passado como entrada,
     * a entrada deve ser uma matriz de adjacencias.
     * A coloração é feita seguindo a propriedade onde
     * um vértice não pode possuir a mesma cor que seu adjacente.
     * As possíveis cores estão no vertor de caracteres cores[].
     * @param grafo
     * @return um vetor de caracteres contendo a cor de cada vértice
    */
    public char[] colorir(int grafo[][]) {

        char[] resultado = new char[grafo.length];
        char[] cores = {'a','b','c','d','e','f','g'};
        boolean[] coloridos = new boolean[grafo.length];
        int aux = 0;

        for (int i = 0; i < grafo.length; i++) {
            aux = 0;
            if (!coloridos[i]) {
                List<Integer> adj = getAdjacentes(i, grafo);
                for (int j = 0; j < adj.size(); j++) {
                    while (cores[aux] == getCor(adj.get(j), resultado)) {
                        aux++;
                    }
                    resultado[i] = cores[aux];
                }
            }
            coloridos[i] = true;
        }
        return resultado;

    }
}