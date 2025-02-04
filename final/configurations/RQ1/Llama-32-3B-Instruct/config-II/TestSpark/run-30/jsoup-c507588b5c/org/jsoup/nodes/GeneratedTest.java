package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Element parentElement;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings outSettings;

    public TextNode getTextNode() {
        return new TextNode("");
    }

    @Test
    public void textNodeCreatedWithEmptyText_Succeeds() {
        TextNode textNode = new TextNode("");
        assertNotNull(textNode.value());
        assertEquals("", textNode.text());
    }

    @Test
    public void nodeName_Succeeds() {
        TextNode textNode = getTextNode();
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void getWholeText_Succeeds() {
        TextNode textNode = new TextNode("Hello World!");
        when(parentNode.getWholeText()).thenReturn("");
        String wholeText = textNode.getWholeText();
        assertEquals("Hello World!", wholeText);
    }

    @Test
    public void isBlank_SucceedsWithEmptyString() {
        TextNode textNode = getTextNode();
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_SucceedsWithNonEmptyString() {
        TextNode textNode = new TextNode("Hello World!");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_SplitsTextAtOffset() {
        String text = "Hello World!";
        TextNode textNode = getTextNode();
        textNode.coreValue = text;
        TextNode splitNode = textNode.splitText(5);
        assertEquals("Hello", splitNode.text());
        assertEquals("World!", textNode.text());
    }

    @Test
    public void splitText_SplitOffsetIsZero() {
        String text = "Hello World!";
        TextNode textNode = getTextNode();
        textNode.coreValue = text;
        when(parentNode.getWholeText()).thenReturn("");
        int offset = 0;
        TextNode splitNode = textNode.splitText(offset);
        assertEquals("", splitNode.text());
    }

    @Test
    public void outerHtmlHead_Succeeds() {
        String text = "Hello World!";
        TextNode textNode = getTextNode();
        textNode.coreValue = text;
        when(parentNode.nodeName()).thenReturn("#div");
        textNode.outerHtmlHead(accum, 0, outSettings);
        assertEquals("<div>Hello World!</div>", accum.toString());
    }

    @Test
    public void outerHtmlTail_Succeeds() {
        TextNode textNode = getTextNode();
        textNode.outerHtmlTail(accum, 0, outSettings);
    }

    @Test
    public void toString_Succeeds() {
        String text = "Hello World!";
        TextNode textNode = getTextNode();
        textNode.coreValue = text;
        assertEquals("<#text>Hello World!</#text>", textNode.toString());
    }

    @Test
    public void clone_Succeeds() {
        TextNode originalTextNode = new TextNode("Hello World!");
        when(parentNode.getWholeText()).thenReturn("");
        TextNode clonedTextNode = originalTextNode.clone();
        assertEquals(originalTextNode.value(), clonedTextNode.value());
    }

}