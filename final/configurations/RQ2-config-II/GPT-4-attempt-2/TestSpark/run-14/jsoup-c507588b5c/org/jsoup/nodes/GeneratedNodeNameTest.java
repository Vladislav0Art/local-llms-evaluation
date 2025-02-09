package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document.OutputSettings;

import static org.junit.Assert.*;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("hello");
        assertEquals("#text", textNode.nodeName());
    }

}