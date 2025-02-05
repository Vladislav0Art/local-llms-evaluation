package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertNodeTest {

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        TextNode textNode = new TextNode("test", "http://example.com");
        treeBuilder.insertNode(textNode);
        assertTrue(treeBuilder.getStack().contains(textNode));
    }

}