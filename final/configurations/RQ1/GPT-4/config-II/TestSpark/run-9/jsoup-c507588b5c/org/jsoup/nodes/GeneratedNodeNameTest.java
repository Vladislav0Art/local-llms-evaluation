package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        String text = "Sample text";
        TextNode textNode = new TextNode(text);
        assertEquals("#text", textNode.nodeName());
    }

}