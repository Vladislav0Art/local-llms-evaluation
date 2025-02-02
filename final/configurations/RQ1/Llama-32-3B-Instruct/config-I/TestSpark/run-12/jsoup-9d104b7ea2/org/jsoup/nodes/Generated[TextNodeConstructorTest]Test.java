package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class Generated[TextNodeConstructorTest]

Test {

    @Test
    public void [TextNodeConstructorTest]Test() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertNotNull(node.value);
        assertEquals(text, node.text());
    }

}