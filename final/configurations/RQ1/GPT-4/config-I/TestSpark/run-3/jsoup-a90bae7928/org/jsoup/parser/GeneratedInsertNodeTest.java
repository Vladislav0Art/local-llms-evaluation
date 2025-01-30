package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertNodeTest {

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Node node = new Element("foo");
        treeBuilder.insertNode(node);
        assertEquals("foo", treeBuilder.currentElement().childNodes().get(0).nodeName());
    }

}