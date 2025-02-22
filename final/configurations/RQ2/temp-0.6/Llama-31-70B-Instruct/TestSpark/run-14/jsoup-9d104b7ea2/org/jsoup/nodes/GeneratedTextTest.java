package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("abc  def");
        textNode.text("xyz");
        assertEquals(textNode.text(), "xyz");
    }

}