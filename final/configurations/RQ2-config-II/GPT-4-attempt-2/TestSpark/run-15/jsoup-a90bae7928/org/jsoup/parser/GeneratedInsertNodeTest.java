package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertNodeTest {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    // Test initialiseParse method

    @Test
    public void insertNodeTest() {
        Node node = new Element("newNode");
        xmlTreeBuilder.insertNode(node);

        List<Node> nodeList = xmlTreeBuilder.getStack();
        Assert.assertTrue(nodeList.contains(node));
    }

}