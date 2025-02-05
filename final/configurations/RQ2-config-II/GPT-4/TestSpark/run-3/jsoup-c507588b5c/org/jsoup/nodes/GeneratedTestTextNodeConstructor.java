package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextNodeConstructor {

    @Test
    public void testTextNodeConstructor() {
        TextNode textNode = new TextNode("Test Text Node");
        assertNotNull(textNode);
        assertEquals("Test Text Node", textNode.text());
    }

}