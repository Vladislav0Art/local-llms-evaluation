package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class Generated[TextNode_Clone]

Test {

    @Test
    public void [TextNode_Clone]Test() throws IOException {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        TextNode clonedNode = textNode.clone();
        assertEquals("Hello", clonedNode.text());
    }

}