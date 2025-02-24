package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTextWithEmptyStringArgumentTest {

    @Test
    public void textWithEmptyStringArgumentTest() {
        TextNode textNode = new TextNode("test");
        TextNode newTextNode = textNode.text("");
        assertNotNull(newTextNode);
        assertEquals("", newTextNode.text());
    }

}