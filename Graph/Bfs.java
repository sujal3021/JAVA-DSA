import java.util.*;

public class Bfs {
    
    private int vertices;
    private LinkedList<Integer>[] adj;

    @SuppressWarnings("unchecked")
    public Bfs(int v)
    {
        vertices=v;
        adj=new LinkedList[v];

        for(int i=0;i<v;i++)
        {
           adj[i]=new LinkedList();
        }
    }

    public void addEdge(int s,int d)
    {
        adj[s].add(d);
    }

    public void bfs(int startNode)
    {
        boolean visited[]=new boolean[vertices];
        Queue<Integer> q=new LinkedList<>();

        visited[startNode]=true;
        q.add(startNode);

        while(!q.isEmpty())
        {
            int currNode=q.poll();
            System.out.print(currNode+" ");

            for(int n:adj[currNode])
            {
                if(!visited[n])
                {
                    visited[n]=true;
                    q.add(n);
                }
            }
        }
    }

    public static void main(String args[])
    {
        Bfs obj=new Bfs(5);

        obj.addEdge(0,1);
        obj.addEdge(0,2);
        obj.addEdge(1,3);
        obj.addEdge(1,4);

        System.out.println("Breadth first Search traversal:");

        obj.bfs(1);
        
    }
}


