package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTextWithNonEmptyStringArgumentTest {

    @Test
    public void textWithNonEmptyStringArgumentTest() {
        TextNode textNode = new TextNode("test");
        TextNode newTextNode = textNode.text("new test");
        assertNotNull(newTextNode);
        assertEquals("new test", newTextNode.text());
    }

}