package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testGetTag() {
        Node node = new LeafNode();
        assertEquals("tag", node.getTag());
        node.setTag("new_tag");
        assertEquals("new_tag", node.getTag());
    }

    @Test
    public void testSetTag() {
        Node node = new LeafNode();
        String tag = "example";
        node.setTag(tag);
        assertEquals(tag, node.getTag());
    }

    @Test
    public void testGetName() {
        Node node = new LeafNode();
        assertEquals("example", node.getName());
        node.setName("new_name");
        assertEquals("new_name", node.getName());
    }

    @Test
    public void testSetName() {
        Node node = new LeafNode();
        String name = "example";
        node.setName(name);
        assertEquals(name, node.getName());
    }

    @Test
    public void testIsEmpty() {
        Node node = new LeafNode();
        assertTrue(node.isEmpty());
        node.setNode("new_node");
        assertFalse(node.isEmpty());
    }

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