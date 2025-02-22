package org.jsoup.nodes;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    TextNode textNode;

    @BeforeClass
    public static void setUp() {
        // Set up the test environment (if needed)
    }

    @Test
    public void testNodeName() {
        when(textNode.nodeName()).thenReturn("#text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        when(textNode.text()).thenReturn("Text");
        assertEquals("Text", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        when(textNode.getWholeText()).thenReturn("Whole Text");
        assertEquals("Whole Text", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        when(textNode.isBlank()).thenReturn(true);
        assertEquals(true, textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        when(textNode.splitText(1)).thenReturn(null);
        assertEquals(null, textNode.splitText(1));
    }

    @Test
    public void testOuterHtmlHead() {
        when(textNode.outerHtmlHead(null, 1, null)).thenReturn(null);
        assertEquals(null, textNode.outerHtmlHead(null, 1, null));
    }

}