package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void textNodeConstructorTest() {
        String text = "sample text";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

}