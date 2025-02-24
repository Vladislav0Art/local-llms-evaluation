package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTextWithNullArgumentTest {

    @Test
    public void textWithNullArgumentTest() {
        TextNode textNode = new TextNode("test");
        TextNode newTextNode = textNode.text(null);
        assertNotNull(newTextNode);
        assertEquals("", newTextNode.text());
    }

}