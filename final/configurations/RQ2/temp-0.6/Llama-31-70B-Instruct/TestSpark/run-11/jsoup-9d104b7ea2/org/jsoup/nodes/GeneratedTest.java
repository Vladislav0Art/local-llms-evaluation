package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private TextNode textNode;

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        when(textNode.getWholeText()).thenReturn("test");
        when(textNode.coreValue()).thenReturn("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        when(textNode.coreValue()).thenReturn("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        when(textNode.coreValue()).thenReturn("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        when(textNode.coreValue()).thenReturn("test");
        TextNode splitTextNode = textNode.splitText(1);
        assertNotNull(splitTextNode);
        assertEquals("t", textNode.coreValue());
        assertEquals("est", splitTextNode.coreValue());
    }

}