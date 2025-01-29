package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest_text {

    @Test
    public void test_text() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("Hello, World!", node.text());
    }

}