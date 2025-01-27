package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedInsertNode_GivenNodeAndToken_ReturnsInsertedNode {

    @Test
    public void insertNode_GivenNodeAndToken_ReturnsInsertedNode() {
        Node node = new Node.Node("root");
        Token token = new Token.Token("tag", "child", null, null);
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Node insertedNode = treeBuilder.insertNode(node, token);
        assertNotNull(insertedNode);
        assertEquals("root", insertedNode.tagName());
    }

}