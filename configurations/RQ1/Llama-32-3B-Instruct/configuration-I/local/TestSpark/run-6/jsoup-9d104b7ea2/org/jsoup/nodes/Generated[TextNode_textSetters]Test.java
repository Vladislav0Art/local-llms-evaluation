package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class Generated[TextNode_textSetters]

Test {

    @Test
    public void [TextNode_textSetters]Test() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        textNode.text("World");
        assertEquals("World", textNode.text());
    }

}