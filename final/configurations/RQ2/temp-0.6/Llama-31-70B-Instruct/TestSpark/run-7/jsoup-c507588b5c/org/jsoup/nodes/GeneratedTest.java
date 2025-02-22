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
        textNode = new TextNode("text");
    }

    @Test
    public void testTextNodeConstructor() {
        assertEquals("text", textNode.coreValue());
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        assertEquals("text", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        assertTrue(!textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode splitText = textNode.splitText(2);
        assertEquals("te", textNode.coreValue());
        assertEquals("xt", splitText.coreValue());
    }

    @Test
    public void testCreateFromEncoded() {
        TextNode encodedTextNode = TextNode.createFromEncoded("&lt;test&gt;");
        assertEquals("<test>", encodedTextNode.coreValue());
    }

    @Test
    public void testNormaliseWhitespace() {
        assertEquals("text", TextNode.normaliseWhitespace(" \ntext\t"));
    }

    @Test
    public void testStripLeadingWhitespace() {
        assertEquals("text\n", TextNode.stripLeadingWhitespace(" \ntext\n"));
    }

}