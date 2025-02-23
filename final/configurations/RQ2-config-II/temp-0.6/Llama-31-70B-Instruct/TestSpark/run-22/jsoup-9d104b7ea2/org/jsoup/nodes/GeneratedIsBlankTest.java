package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode(" ");
        assertEquals(true, textNode.isBlank());
        textNode = new TextNode("text");
        assertEquals(false, textNode.isBlank());
    }

}