package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("   text   ");
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

}