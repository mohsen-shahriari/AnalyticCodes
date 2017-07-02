package com.company;

import org.gephi.graph.api.*;
import org.gephi.graph.spi.LayoutData;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by shahriari on 02.07.17.
 */
public class CustomNode implements Node {
    private Integer id;
    private String label;
 //   private List<T> attributes;


    public CustomNode(Integer id, String label) {
        this.id = id;
        this.label = label;
 //       this.attributes=new ArrayList<T>();
    }

    @Override
    public Object getId() {
        return this.id;
    }

    @Override
    public String getLabel() {
        return this.label;
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

        this.label= s;

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
    public float x() {
        return 0;
    }

    @Override
    public float y() {
        return 0;
    }

    @Override
    public float z() {
        return 0;
    }

    @Override
    public float size() {
        return 0;
    }

    @Override
    public boolean isFixed() {
        return false;
    }

    @Override
    public <T extends LayoutData> T getLayoutData() {
        return null;
    }

    @Override
    public void setX(float v) {

    }

    @Override
    public void setY(float v) {

    }

    @Override
    public void setZ(float v) {

    }

    @Override
    public void setSize(float v) {

    }

    @Override
    public void setPosition(float v, float v1) {

    }

    @Override
    public void setPosition(float v, float v1, float v2) {

    }

    @Override
    public void setFixed(boolean b) {

    }

    @Override
    public void setLayoutData(LayoutData layoutData) {

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
