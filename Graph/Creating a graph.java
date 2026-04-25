import java.util.* ;
class Main {
    /*
        0(5)1 , 1(1)2 , 1(3)3 ,  2(2)4
    */
    static class Edge {
        int s ;
        int d ;
        int w ;
        
        public Edge(int sr , int dst , int wt){
            this.s = sr ;
            this.d = dst ;
            this.w = wt ;
        }
    }
    public static void main(String[] args) {
        
        int V = 5 ;
        ArrayList<Edge>[] graph = new ArrayList[V];
        
        for(int i = 0 ; i < V ; i++){
            graph[i] = new ArrayList<>();
        }
        
        graph[0].add(new Edge(0,1,5));
        
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));
        
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));
        
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));
        
        graph[4].add(new Edge(4,2,2));
        
        // 2's neighbor 
        for(int i = 0 ; i <graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.d);
        }
    }
}
