package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private TextNode textNode;

    @Test
    public void testNodeName() {
        when(textNode.nodeName()).thenReturn("#text");

        String actual = textNode.nodeName();

        assertEquals("#text", actual);
    }

    @Test
    public void testText() {
        when(textNode.coreValue()).thenReturn("Text");

        String actual = textNode.text();

        assertEquals("Text", actual);
    }

    @Test
    public void testGetWholeText() {
        when(textNode.coreValue()).thenReturn("Whole Text");

        String actual = textNode.getWholeText();

        assertEquals("Whole Text", actual);
    }

    @Test
    public void testIsBlank() {
        when(textNode.coreValue()).thenReturn("");

        boolean actual = textNode.isBlank();

        assertTrue(actual);
    }

    @Test
    public void testSplitText() {
        when(textNode.coreValue()).thenReturn("Text");
        when(textNode.siblingIndex()).thenReturn(1);
        when(textNode.parentNode()).thenReturn(null);

        TextNode actual = textNode.splitText(2);

        assertEquals("ext", actual.coreValue());
    }

}