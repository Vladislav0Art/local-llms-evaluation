package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("test");
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        assertEquals("test", textNode.text());
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        assertTrue(!textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode newNode = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("st", newNode.getWholeText());
    }

    @Test
    public void testOuterHtmlHead() {
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Mockito.when(out.prettyPrint()).thenReturn(true);

        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("test", accum.toString());
    }

    @Test
    public void testCreateFromEncoded() {
        TextNode newNode = TextNode.createFromEncoded("&lt;");
        assertEquals("<", newNode.getWholeText());
    }

}