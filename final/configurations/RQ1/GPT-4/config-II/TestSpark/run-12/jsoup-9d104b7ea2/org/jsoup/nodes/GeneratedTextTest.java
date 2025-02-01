package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode(" Test Text. ");
        assertEquals("Test Text.", textNode.text());

        textNode.text("Changed Text.");
        assertEquals("Changed Text.", textNode.getWholeText());
    }

}