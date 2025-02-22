package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("text");
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        assertEquals(textNode.text(), "text");
    }

    @Test
    public void testGetWholeText() {
        assertEquals(textNode.getWholeText(), "text");
    }

    @Test
    public void testIsBlank() {
        textNode = new TextNode("");
        assertTrue(textNode.isBlank());
        textNode = new TextNode(" ");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode2 = textNode.splitText(2);
        assertEquals(textNode.coreValue(), "te");
        assertEquals(textNode2.coreValue(), "xt");
    }

    @Test
    public void testOuterHtmlHead() {
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint(true);
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("<text>\n", accum.toString());
    }

    @Test
    public void testToString() {
        assertEquals("text", textNode.toString());
    }

}