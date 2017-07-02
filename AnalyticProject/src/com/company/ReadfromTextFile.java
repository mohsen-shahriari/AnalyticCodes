package com.company;

import org.gephi.graph.api.Edge;
import org.gephi.graph.api.Graph;
import org.gephi.graph.api.Node;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @ Mohsen Shahriari
 * email: shahriari.m88@gmail.com
 */

/**
 * This function implements the Iread interface.
 * It reads text files that composes network data with the format "source node", "destination node" and "weight"-
 * Each line is correspondent with an edge in the graph. Source node, destination node and the weight are sperated
 * via spaces in each line of the code.
 */
public class ReadfromTextFile implements IreadNetwork{

    private Graph graph;


    private String fileName;

    @Override
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public Graph readGraph() {
        this.graph= new CustomGraph();
        try(BufferedReader br = new BufferedReader(new FileReader(this.fileName))) {


           // String columnNames= br.readLine();
            String line;
            int i=0;

            while((line=br.readLine())!=null){


                String [] s= line.split("  ");

                int source=Integer.parseInt(s[0].trim());
                int destination=Integer.parseInt(s[1].trim());
                double weight=Double.parseDouble(s[2].trim());
              //  System.out.println(source);

                Node sourceNode= new CustomNode(source, String.valueOf(source));

                Node destinationNode=new CustomNode(destination, String.valueOf(destination));

                Edge edge=new CustomEdge(i, sourceNode, destinationNode, weight);

                this.graph.addNode(sourceNode);
                this.graph.addNode(destinationNode);
                this.graph.addEdge(edge);

                i+=1;


            }

        }
        catch(Exception e){

            System.out.println("there is an exception:\t " + e.getLocalizedMessage());
            return null;

        }

        return this.graph;




    }

}
