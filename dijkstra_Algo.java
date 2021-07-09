import java.util.Scanner;

public class dijkstra_Algo {
    static int V;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        V = s.nextInt();
        int edges = s.nextInt();
        int[][] graph = new int[V][V];

        for(int i = 0; i<edges; i++){
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            int weight = s.nextInt();
            graph[v1][v2] = weight;
            graph[v2][v1] = weight;
        }

        int src = s.nextInt();
        dijkstra(graph, src);

    }

    private static void dijkstra(int[][] graph, int src) {
        int dist[] = new int[V];
        Boolean sptSet[] = new Boolean[V]; //will be true if index is visited

        //Initialize all distances as infinite and stpSet[] as false
        for (int i = 0; i<V; i++){
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        //distance from source itself is 0
        dist[src] = 0;

        for (int count = 0; count<V; count++){
            int u = minDistance(dist, sptSet);

            //mark the picked
            sptSet[u] = true;

            for (int v = 0; v<V; v++){
                if(!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u]+graph[u][v] < dist[v]){
                    dist[v] = dist[u] + graph[u][v];
                }

            }

        }
        //print
        printSol(dist);
    }

    private static void printSol(int[] dist) {
        System.out.println("Vertex \t Distance From Source");
        for(int i = 0; i<V; i++){
            System.out.println(i+" \t\t "+dist[i]);
        }
    }

    private static int minDistance(int[] dist, Boolean[] sptSet) {
        int min = Integer.MAX_VALUE, min_index = -1;

        for(int v = 0; v<V; v++){
            if(sptSet[v]==false && dist[v] <= min){
                min = dist[v];
                min_index = v;
            }
        }
        return min_index;
    }
}
