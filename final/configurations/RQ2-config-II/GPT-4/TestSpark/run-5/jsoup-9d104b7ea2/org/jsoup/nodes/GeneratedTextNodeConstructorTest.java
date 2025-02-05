package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void textNodeConstructorTest() {
        String text = "test";
        TextNode textNode = new TextNode(text);

        assertNotNull(textNode);
        assertEquals(text, textNode.text());
    }

}