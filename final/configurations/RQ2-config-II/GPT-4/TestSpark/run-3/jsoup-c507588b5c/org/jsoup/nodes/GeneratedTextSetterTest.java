package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("Test Text Node");
        textNode.text("Setting new text");
        String text = textNode.text();
        assertEquals("Setting new text", text);
    }

}