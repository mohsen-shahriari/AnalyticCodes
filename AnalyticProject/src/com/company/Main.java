package com.company;

import org.gephi.graph.api.Graph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Please enter the path for the graph");

       try( Scanner scanner= new Scanner(System.in)) {


           ReadfromTextFile graphReader = new ReadfromTextFile();


           graphReader.setFileName(scanner.next().toString());


           Graph graph = graphReader.readGraph();
           System.out.println("number of edges equal to " + graph.getEdgeCount());


           System.out.println("number of nodes equal to " + graph.getNodeCount());

       }
       catch (Exception e){

           System.out.println("there is an exception" + e.getMessage());
       }

    }
}
