package com.company;

import org.gephi.graph.api.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by shahriari on 02.07.17.
 */

public class CustomGraph implements Graph{

    private Map<Integer,Edge> edgeList;

    private Map<Integer,Node> nodeList;

    private int numberOfNodes;

    private int numberOfEdges;

    public CustomGraph() {
        this.numberOfNodes = 0;
        this.numberOfEdges = 0;
        edgeList= new HashMap<>();
        nodeList= new HashMap<>();
    }


  //  public boolean addEdge(Integer index,Edge edge) {

//        edgeList.put(index, edge);


  //      return true;
   // }

  //  public boolean addNode(Integer index, Node node) {
   //     nodeList.put(index, node);
    //    return true;
    //}

    @Override
    public boolean addEdge(Edge edge) {
        edgeList.put( (Integer) edge.getId(), edge);
        return true;
    }

    @Override
    public boolean addNode(Node node) {
        nodeList.put((Integer) node.getId(),node);
        return true;
    }

    @Override
    public boolean addAllEdges(Collection<? extends Edge> collection) {
        return false;
    }

    @Override
    public boolean addAllNodes(Collection<? extends Node> collection) {
        return false;
    }

    @Override
    public boolean removeEdge(Edge edge) {
        return false;
    }

    @Override
    public boolean removeNode(Node node) {
        return false;
    }

    @Override
    public boolean removeAllEdges(Collection<? extends Edge> collection) {
        return false;
    }

    @Override
    public boolean removeAllNodes(Collection<? extends Node> collection) {
        return false;
    }

    @Override
    public boolean contains(Node node) {
        return false;
    }

    @Override
    public boolean contains(Edge edge) {
        return false;
    }

    @Override
    public Node getNode(Object o) {

        return nodeList.get(o);
    }

    @Override
    public boolean hasNode(Object o) {
        return false;
    }

    @Override
    public Edge getEdge(Object o) {
        return edgeList.get(o);
    }

    @Override
    public boolean hasEdge(Object o) {
        return false;
    }

    @Override
    public Edge getEdge(Node node, Node node1) {
        return null;
    }

    @Override
    public EdgeIterable getEdges(Node node, Node node1) {
        return null;
    }

    @Override
    public Edge getEdge(Node node, Node node1, int i) {
        return null;
    }

    @Override
    public EdgeIterable getEdges(Node node, Node node1, int i) {
        return null;
    }

    @Override
    public NodeIterable getNodes() {
        return null;
    }

    @Override
    public EdgeIterable getEdges() {
        return null;
    }

    @Override
    public EdgeIterable getSelfLoops() {
        return null;
    }

    @Override
    public NodeIterable getNeighbors(Node node) {
        return null;
    }

    @Override
    public NodeIterable getNeighbors(Node node, int i) {
        return null;
    }

    @Override
    public EdgeIterable getEdges(Node node) {
        return null;
    }

    @Override
    public EdgeIterable getEdges(Node node, int i) {
        return null;
    }

    @Override
    public int getNodeCount() {
        return nodeList.size();
    }

    @Override
    public int getEdgeCount() {
        return edgeList.size();
    }

    @Override
    public int getEdgeCount(int i) {
        return 0;
    }

    @Override
    public Node getOpposite(Node node, Edge edge) {
        return null;
    }

    @Override
    public int getDegree(Node node) {
        return 0;
    }

    @Override
    public boolean isSelfLoop(Edge edge) {
        return false;
    }

    @Override
    public boolean isDirected(Edge edge) {
        return false;
    }

    @Override
    public boolean isAdjacent(Node node, Node node1) {
        return false;
    }

    @Override
    public boolean isAdjacent(Node node, Node node1, int i) {
        return false;
    }

    @Override
    public boolean isIncident(Edge edge, Edge edge1) {
        return false;
    }

    @Override
    public boolean isIncident(Node node, Edge edge) {
        return false;
    }

    @Override
    public void clearEdges(Node node) {

    }

    @Override
    public void clearEdges(Node node, int i) {

    }

    @Override
    public void clear() {

    }

    @Override
    public void clearEdges() {

    }

    @Override
    public GraphView getView() {
        return null;
    }

    @Override
    public Object getAttribute(String s) {
        return null;
    }

    @Override
    public Object getAttribute(String s, double v) {
        return null;
    }

    @Override
    public Object getAttribute(String s, Interval interval) {
        return null;
    }

    @Override
    public void setAttribute(String s, Object o) {

    }

    @Override
    public void removeAttribute(String s) {

    }

    @Override
    public void setAttribute(String s, Object o, double v) {

    }

    @Override
    public void setAttribute(String s, Object o, Interval interval) {

    }

    @Override
    public void removeAttribute(String s, double v) {

    }

    @Override
    public void removeAttribute(String s, Interval interval) {

    }

    @Override
    public Set<String> getAttributeKeys() {
        return null;
    }

    @Override
    public GraphModel getModel() {
        return null;
    }

    @Override
    public boolean isDirected() {
        return false;
    }

    @Override
    public boolean isUndirected() {
        return false;
    }

    @Override
    public boolean isMixed() {
        return false;
    }

    @Override
    public void readLock() {

    }

    @Override
    public void readUnlock() {

    }

    @Override
    public void readUnlockAll() {

    }

    @Override
    public void writeLock() {

    }

    @Override
    public void writeUnlock() {

    }
}
