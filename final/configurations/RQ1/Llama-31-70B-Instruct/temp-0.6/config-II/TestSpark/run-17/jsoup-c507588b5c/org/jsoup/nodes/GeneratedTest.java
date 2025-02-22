package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("hello world");
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        assertEquals("hello world", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        assertEquals("hello world", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        assertTrue(!textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode splitTextNode = textNode.splitText(3);
        assertEquals("hel", textNode.getWholeText());
        assertEquals("lo world", splitTextNode.getWholeText());
    }

    @Test
    public void testOuterHtmlHead() throws Exception {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Mockito.when(out.prettyPrint()).thenReturn(true);
        textNode.outerHtmlHead(accum, 0, out);
        Mockito.verify(accum).append("hello world");
    }

    @Test
    public void testOuterHtmlTail() {
        TextNode.outerHtmlTail(null, 0, null);
    }

    @Test
    public void testToString() {
        assertEquals("hello world", textNode.toString());
    }

}