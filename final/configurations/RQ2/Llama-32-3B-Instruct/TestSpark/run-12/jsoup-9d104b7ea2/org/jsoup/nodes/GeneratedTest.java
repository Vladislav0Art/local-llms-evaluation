package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Text;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void newNodeCreation

    TestNewTextNode() {
        Object newTextNode = null;
        newTextNode = new TextNode("Hello, World!");
        assertNotNull(newTextNode);
    }

    @Test
    public void getNodeId

    TextNodeGetNodeIdTest() {
        LeafNode leafNode = null;
        leafNode = new LeafNode();
        assertEquals(0, ((LeafNode) leafNode).getId());
    }

    @Test
    public void getNodeName

    TextNodeGetNodeNameTest() {
        LeafNode leafNode = null;
        leafNode = new LeafNode();
        String node = leafNode.getNodeName();
        assertNotNull(node);
    }

    @Test
    public void getAttributes

    TextNodeGetAttributeTest() {
        LeafNode leafNode = null;
        leafNode = new LeafNode();
        assertEquals(0, ((LeafNode) leafNode).getAttributes().size());
    }

    @Test
    public void getChildNodes

    TextNodeGetChildNodesTest() {
        LeafNode leafNode = null;
        leafNode = new LeafNode();
        assertEquals(0, ((LeafNode) leafNode).getChildNodes().size());
    }

    @Test
    public void setAttribute

    TextNodeSetAttributeTest() {
        LeafNode leafNode = null;
        leafNode = new LeafNode();
        leafNode.setAttribute("key", "value");
        assertEquals(1, ((LeafNode) leafNode).getAttributes().size());
    }

    @Test
    public void getChildNodesLength

    TextNodeGetChildNodesLengthTest() {
        LeafNode leafNode = null;
        leafNode = new LeafNode();
        assertEquals(0, ((LeafNode) leafNode).getChildNodes().size());
    }

    @Test
    public void setAttributeText

    TextNodeSetAttributeTextTest() {
        LeafNode leafNode = null;
        leafNode = new LeafNode();
        leafNode.setAttribute("key", "value");
        String node = leafNode.getAttribute("key").toString();
        assertEquals("value", node);
    }

    @Test
    public void getRoot

    TextNodeGetRootTest() {
        LeafNode leafNode = null;
        leafNode = new LeafNode();
        assertNotNull(leafNode.getRoot());
    }

    @Test
    public void setChildNodes

    TextNodeSetChildNodesTest() {
        LeafNode leafNode = null;
        leafNode = new LeafNode();
        assertEquals(0, ((LeafNode) leafNode).getChildNodes().size());
    }

    @Test
    public void getRootText

    TextNodeGetRootTextTest() {
        LeafNode leafNode = null;
        leafNode = new LeafNode();
        assertNotNull(leafNode.getRoot());
    }

}