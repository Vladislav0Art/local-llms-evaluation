package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class Generated[TextNodeTextSetterTest]

Test {

    @Test
    public void [TextNodeTextSetterTest]Test() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        node.text("New Text");
        assertEquals("New Text", node.text());
    }

}