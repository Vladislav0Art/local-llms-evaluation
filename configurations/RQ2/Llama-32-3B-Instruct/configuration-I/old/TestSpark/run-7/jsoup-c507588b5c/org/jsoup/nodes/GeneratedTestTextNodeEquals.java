package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextNodeEquals {

    @Test
    public void testTextNodeEquals() {
        TextNode textNode1 = new TextNode("test");
        TextNode textNode2 = new TextNode("test");

        assertEquals(true, textNode1.equals(textNode2));
    }

}