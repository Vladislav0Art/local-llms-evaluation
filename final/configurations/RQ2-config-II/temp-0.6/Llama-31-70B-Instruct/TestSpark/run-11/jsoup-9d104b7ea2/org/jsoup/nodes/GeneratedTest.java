package org.jsoup.nodes;

import org.junit.Before;
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

    @Before
    public void setUp() {
        textNode = new TextNode("");
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        assertEquals("", textNode.text());
    }

    @Test
    public void testSetText() {
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        assertEquals("", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        assertEquals(true, textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode splitText = textNode.splitText(5);
        assertEquals("", textNode.coreValue());
        assertEquals("", splitText.coreValue());
    }

    @Test
    public void testOuterHtmlHead() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("", accum.toString());
    }

}