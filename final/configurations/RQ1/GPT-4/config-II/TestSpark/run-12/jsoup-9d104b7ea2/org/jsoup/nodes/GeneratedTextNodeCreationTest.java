package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeCreationTest {

    @Test
    public void textNodeCreationTest() {
        TextNode textNode = new TextNode("Just Testing.");
        assertNotNull(textNode);
        assertEquals("Just Testing.", textNode.getWholeText());
    }

}