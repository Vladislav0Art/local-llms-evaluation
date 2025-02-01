package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextSetterGetterTest {

    @Test
    public void textSetterGetterTest() {
        TextNode node = new TextNode("  some text  ");
        node.text("new text");
        assertEquals("new text", node.text());
    }

}