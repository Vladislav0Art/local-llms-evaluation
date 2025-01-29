package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetTagAndName {

    @Test
    public void testGetTagAndName() {
        Node node = new LeafNode();
        assertEquals("example", node.getTag(), "name");
        node.setName("new_name");
        assertEquals("new_name", node.getName(), "tag");
    }
}

class LeafNode extends Node {
    public String tag;
    public String name;

    @Override
    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTag() {
        return tag;
    }
}

class Node {
    private String tag;
    private String name;

    public LeafNode setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public LeafNode setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public void setNode(String node) {
        this.node = node;
    }

    public String getTag() {
        return tag;
    }

    public String getName() {
        return name;
    }
}

class Leaf extends Node {
    private String data;

    public Leaf addData(String data) {
        this.data = data;
        return this;
    }

    @Override
    public void setNode(String node) {
        super.setNode(node);
        this.node = node;
    }

    @Override
    public String getData() {
        return data;
    }

}