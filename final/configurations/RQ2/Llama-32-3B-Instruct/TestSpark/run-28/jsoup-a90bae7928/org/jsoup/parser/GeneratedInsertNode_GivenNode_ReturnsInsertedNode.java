package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedInsertNode_GivenNode_ReturnsInsertedNode {

    @Test
    public void insertNode_GivenNode_ReturnsInsertedNode() {
        Node node = new Node.Node("root");
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Node insertedNode = treeBuilder.insertNode(node);
        assertNotNull(insertedNode);
        assertEquals("root", insertedNode.tagName());
    }

}