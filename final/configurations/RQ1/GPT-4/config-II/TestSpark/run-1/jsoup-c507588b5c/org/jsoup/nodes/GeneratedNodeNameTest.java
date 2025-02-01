package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals("#text", textNode.nodeName());
    }

}