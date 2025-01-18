package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.Parser;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertNodeTest {

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element node = new Element("element");
        xmlTreeBuilder.insertNode(node);
        Assert.assertEquals(node, xmlTreeBuilder.stack.get(0));
    }

}