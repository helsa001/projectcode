package com.company;

import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String arg[])   {
        int V = 6;
        int source = 0;

        // adjacency list representation of the graph
        List<List<Node>> adj_list = new ArrayList<List<Node>>();
        // Initialise adjacency list for every node in the graph
        for (int i = 0; i < V; i++) {
            List<Node> item = new ArrayList<Node>();
            adj_list.add(item);
        }

        // Input graph edges
        adj_list.get(0).add(new Node(1 , 50));
        adj_list.get(0).add(new Node(2, 40));
        adj_list.get(0).add(new Node(3, 25));
        adj_list.get(0).add(new Node(4, 35));
        adj_list.get(0).add(new Node(5, 20));

        // call Dijkstra's algorithm method
        Graph_pq dpq = new Graph_pq(V);
        dpq.algo_dijkstra(adj_list, source);

        //print the algorithm
        System.out.println("The shorted and quickest path from the barber to the user:");
        System.out.println("User\t" + "Barber\t" + "Distance");
        for (int i = 1; i < dpq.dist.length; i++)
            System.out.println(source + " \t\t " + i + " \t\t "  + dpq.dist[i] +" minutes");


        //the journey from barber to user's location
        System.out.println("Journey:");
        for (int i = 1; i < dpq.dist.length; i++) {
            if (dpq.dist[i] == 20) {
                System.out.println("Barber "+i+":" + " Take the 27 bus from Baker Street and get off at Chalk Farm");
            }
            else if (dpq.dist[i] == 25)
                {
                    System.out.println("Barber "+i+":" + " Take the Northern Line from Battersea Power Station, terminating at Edgware");
                }
            else if (dpq.dist[i] == 40) {
                System.out.println("Barber "+i + ":" + " Take the Circle Line to Tottenham Court Road Station, then switch to the Northern Line, going northbound");
            }
            else if (dpq.dist[i] == 35) {
                System.out.println("Barber "+i + ":" + " Take the 31 bus till it reaches its final destination");
            }
            else {
                System.out.println("Barber "+i + ":" + " Take the Overground Train to Canada Water, then switch to the Jubilee Line going to Stanmore, then switch at Waterloo Station to the Northern Line");
            }

            }
        }
    }

