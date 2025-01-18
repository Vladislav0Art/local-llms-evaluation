package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertNodeTest {

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Node node = new Node("dummyUri");
        xmlTreeBuilder.insertNode(node);
        assertEquals("dummyUri", xmlTreeBuilder.getStack().peekFirst().baseUri());
    }

}