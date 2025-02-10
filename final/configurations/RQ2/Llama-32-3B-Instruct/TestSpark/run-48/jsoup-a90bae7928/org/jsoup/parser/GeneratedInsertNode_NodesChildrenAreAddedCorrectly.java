package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.Reader;
import java.io.StringReader;

public class GeneratedInsertNode_NodesChildrenAreAddedCorrectly {

    private XmlTreeBuilder treeBuilder = new XmlTreeBuilder();

    @Test
    public void insertNode_NodesChildrenAreAddedCorrectly() {
        Node node = new CDataNode("data");
        treeBuilder.insertNode(node);
        assertNotNull(node.children());
    }

}