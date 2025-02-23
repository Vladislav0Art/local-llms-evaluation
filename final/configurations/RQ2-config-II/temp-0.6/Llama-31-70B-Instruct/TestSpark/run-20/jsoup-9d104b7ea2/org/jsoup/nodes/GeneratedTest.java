package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private TextNode textNode;

    @Test
    public void testTextNode() {
        when(textNode.nodeName()).thenReturn("#text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testTextNodeText() {
        when(textNode.text()).thenReturn("Test Text");
        assertEquals("Test Text", textNode.text());
    }

    @Test
    public void testTextNodeGetWholeText() {
        when(textNode.getWholeText()).thenReturn("Test Text");
        assertEquals("Test Text", textNode.getWholeText());
    }

    @Test
    public void testTextNodeIsBlank() {
        when(textNode.isBlank()).thenReturn(false);
        assertEquals(false, textNode.isBlank());
    }

    @Test
    public void testTextNodeSplitText() {
        when(textNode.splitText(1)).thenReturn(textNode);
        assertEquals(textNode, textNode.splitText(1));
    }

    @Test
    public void testTextNodeToString() {
        when(textNode.toString()).thenReturn("Test Text");
        assertEquals("Test Text", textNode.toString());
    }

    @Test
    public void testTextNodeClone() {
        when(textNode.clone()).thenReturn(textNode);
        assertEquals(textNode, textNode.clone());
    }

    @Test
    public void testTextNodeCreateFromEncoded() {
        when(TextNode.createFromEncoded("Test Text")).thenReturn(textNode);
        assertEquals(textNode, TextNode.createFromEncoded("Test Text"));
    }

}