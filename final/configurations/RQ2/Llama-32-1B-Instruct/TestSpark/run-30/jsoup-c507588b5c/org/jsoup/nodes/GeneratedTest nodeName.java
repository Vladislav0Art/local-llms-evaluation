package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest nodeName {

    @Test
    public void test

    nodeName() {
        String text = "Hello";
        assertEquals("text", TextNode.class.getMethod("nodeName").invoke(new TextNode(text)));
    }

}