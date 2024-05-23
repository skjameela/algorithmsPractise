package org.example;
import java.util.*;
import java.util.LinkedList;
public class BreadthFirstSearch {
    private LinkedList<Integer> adjacency[];


    public BreadthFirstSearch(int n)
    {
        adjacency=new LinkedList[n];
        for(int i=0;i<n;i++)
        {
            adjacency[i]=new LinkedList<Integer>();

        }
    }
    public void  create(int s,int d)
    {
        adjacency[s].add(d);
        adjacency[d].add(s);
    }
    public void traversal(int source)
    {
        boolean visited_notes[]=new boolean[adjacency.length];
        int parent_node[]=new int[adjacency.length];
        Queue<Integer>q=new LinkedList<>();
        q.add(source);
        visited_notes[source]=true;
        parent_node[source]=-1;
        while(!q.isEmpty())
        {
            int m=q.poll();
            System.out.print(m);
            for(int i:adjacency[m])
            {
                if(visited_notes[i]!=true)
                {
                    visited_notes[i]=true;
                    q.add(i);
                    parent_node[i]=m;
                }
            }

        }

    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the vertex and edges : ");
        int v=sc.nextInt();
        int e=sc.nextInt();
        BreadthFirstSearch m=new BreadthFirstSearch(v);
        System.out.print("enter the edges of source and destiny : ");
        for(int i=0;i<e;i++)
        {

            int s=sc.nextInt();
            int d=sc.nextInt();
            m.create(s,d);
        }
        System.out.print("enter thr source le : ");
        int source=sc.nextInt();
        m.traversal(source);

    }
}

