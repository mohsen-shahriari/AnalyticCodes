package com.company;

import org.gephi.graph.api.*;

import java.awt.*;
import java.util.Map;
import java.util.Set;

/**
 * Created by shahriari on 02.07.17.
 */
public class CustomEdge implements Edge {

    private Integer id;

    private Node sourceNode;
    private Node destinationNode;

    private Double weight;

    public CustomEdge(int id, Node sourceNode, Node destinationNode, Double weight) {

        this.id=id;
        this.sourceNode = sourceNode;
        this.destinationNode = destinationNode;
        this.weight = weight;
    }

    @Override
    public Node getSource() {
        return this.sourceNode;
    }

    @Override
    public Node getTarget() {
        return this.destinationNode;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public double getWeight(double v) {
        return 0;
    }

    @Override
    public double getWeight(Interval interval) {
        return 0;
    }

    @Override
    public double getWeight(GraphView graphView) {
        return 0;
    }

    @Override
    public Iterable<Map.Entry> getWeights() {
        return null;
    }

    @Override
    public void setWeight(double v) {
        this.weight=Double.valueOf(v);

    }

    @Override
    public void setWeight(double v, double v1) {

    }

    @Override
    public void setWeight(double v, Interval interval) {

    }

    @Override
    public boolean hasDynamicWeight() {
        return false;
    }

    @Override
    public int getType() {
        return 0;
    }

    @Override
    public Object getTypeLabel() {
        return null;
    }

    @Override
    public boolean isSelfLoop() {
        return false;
    }

    @Override
    public boolean isDirected() {
        return false;
    }

    @Override
    public Object getId() {
        return this.id;
    }

    @Override
    public String getLabel() {
        return null;
    }

    @Override
    public Object getAttribute(String s) {
        return null;
    }

    @Override
    public Object getAttribute(Column column) {
        return null;
    }

    @Override
    public Object getAttribute(String s, double v) {
        return null;
    }

    @Override
    public Object getAttribute(Column column, double v) {
        return null;
    }

    @Override
    public Object getAttribute(String s, Interval interval) {
        return null;
    }

    @Override
    public Object getAttribute(Column column, Interval interval) {
        return null;
    }

    @Override
    public Object getAttribute(String s, GraphView graphView) {
        return null;
    }

    @Override
    public Object getAttribute(Column column, GraphView graphView) {
        return null;
    }

    @Override
    public Iterable<Map.Entry> getAttributes(Column column) {
        return null;
    }

    @Override
    public Object[] getAttributes() {
        return new Object[0];
    }

    @Override
    public Set<String> getAttributeKeys() {
        return null;
    }

    @Override
    public ColumnIterable getAttributeColumns() {
        return null;
    }

    @Override
    public int getStoreId() {
        return 0;
    }

    @Override
    public Object removeAttribute(String s) {
        return null;
    }

    @Override
    public Object removeAttribute(Column column) {
        return null;
    }

    @Override
    public Object removeAttribute(String s, double v) {
        return null;
    }

    @Override
    public Object removeAttribute(Column column, double v) {
        return null;
    }

    @Override
    public Object removeAttribute(String s, Interval interval) {
        return null;
    }

    @Override
    public Object removeAttribute(Column column, Interval interval) {
        return null;
    }

    @Override
    public void setLabel(String s) {

    }

    @Override
    public void setAttribute(String s, Object o) {

    }

    @Override
    public void setAttribute(Column column, Object o) {

    }

    @Override
    public void setAttribute(String s, Object o, double v) {

    }

    @Override
    public void setAttribute(Column column, Object o, double v) {

    }

    @Override
    public void setAttribute(String s, Object o, Interval interval) {

    }

    @Override
    public void setAttribute(Column column, Object o, Interval interval) {

    }

    @Override
    public boolean addTimestamp(double v) {
        return false;
    }

    @Override
    public boolean removeTimestamp(double v) {
        return false;
    }

    @Override
    public boolean hasTimestamp(double v) {
        return false;
    }

    @Override
    public double[] getTimestamps() {
        return new double[0];
    }

    @Override
    public boolean addInterval(Interval interval) {
        return false;
    }

    @Override
    public boolean removeInterval(Interval interval) {
        return false;
    }

    @Override
    public boolean hasInterval(Interval interval) {
        return false;
    }

    @Override
    public Interval[] getIntervals() {
        return new Interval[0];
    }

    @Override
    public void clearAttributes() {

    }

    @Override
    public Table getTable() {
        return null;
    }

    @Override
    public float r() {
        return 0;
    }

    @Override
    public float g() {
        return 0;
    }

    @Override
    public float b() {
        return 0;
    }

    @Override
    public int getRGBA() {
        return 0;
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public float alpha() {
        return 0;
    }

    @Override
    public TextProperties getTextProperties() {
        return null;
    }

    @Override
    public void setR(float v) {

    }

    @Override
    public void setG(float v) {

    }

    @Override
    public void setB(float v) {

    }

    @Override
    public void setAlpha(float v) {

    }

    @Override
    public void setColor(Color color) {

    }
}
