package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTest {

    @Test
    public void testTextNodeText() {
        TextNode node = new TextNode("Test");
        assertEquals("Test", node.text());
    }

    @Test
    public void testTextNodeGetWholeText() {
        TextNode node = new TextNode("Test");
        assertEquals("Test", node.getWholeText());
    }

    @Test
    public void testTextNodeIsBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void testTextNodeSplitText() {
        TextNode node = new TextNode("Test");
        TextNode tailNode = node.splitText(2);
        assertEquals("Te", node.coreValue());
        assertEquals("st", tailNode.coreValue());
    }

    @Test
    public void testTextNodeOuterHtmlHead() throws IOException {
        TextNode node = new TextNode("Test");
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(true);
        when(out.outline()).thenReturn(true);
        node.outerHtmlHead(accum, 0, out);
        verify(accum, times(1)).append("Test");
    }

}