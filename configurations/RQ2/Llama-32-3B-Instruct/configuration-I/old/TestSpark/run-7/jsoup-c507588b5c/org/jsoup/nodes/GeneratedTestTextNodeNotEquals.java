package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextNodeNotEquals {

    @Test
    public void testTextNodeNotEquals() {
        TextNode textNode1 = new TextNode("test");
        TextNode textNode2 = new TextNode("different");

        assertNotEquals(false, textNode1.equals(textNode2));
    }

}