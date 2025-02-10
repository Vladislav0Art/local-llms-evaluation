package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.helper.Validate;

import java.io.Reader;
import java.io.StringReader;

public class Generated[insertNode_node_cDataNodeWithTextContent]

Test {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void [insertNode_node_cDataNodeWithTextContent]Test() throws Exception {
        CDataNode node = new CDataNode("text content");
        xmlTreeBuilder.insertNode(node);
        assert true;
    }

}