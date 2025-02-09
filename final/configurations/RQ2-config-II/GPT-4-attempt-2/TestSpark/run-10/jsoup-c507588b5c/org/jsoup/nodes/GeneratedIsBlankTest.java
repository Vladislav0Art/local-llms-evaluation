package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        String text = " ";
        TextNode textNode = new TextNode(text);
        assertEquals(true, textNode.isBlank());
    }

}