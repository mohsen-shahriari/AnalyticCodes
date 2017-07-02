package com.company;

import org.gephi.graph.api.Graph;

/**
 * Created by shahriari on 30.06.17.
 */
public interface IreadNetwork {

    public void setFileName(String fileName);

    public Graph readGraph();


}
