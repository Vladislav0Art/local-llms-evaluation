package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.io.IOException;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    public String normaliseWhitespace(String input) {
        return StringUtil.normaliseWhitespace(input);
    }

    public String stripLeadingWhitespace(String input) {
        return StringUtil.stripLeadingWhitespace(input);
    }

    public boolean lastCharIsWhitespace(StringBuilder input) {
        return StringUtil.lastCharIsWhitespace(input);
    }

    @Test
    public void nodeName() {
        TextNode textNode = new TextNode("test");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void text() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void normaliseWhitespace() {
        assertEquals("test", TextNode.normaliseWhitespace("   test   "));
    }

    @Test
    public void stripLeadingWhitespace() {
        assertEquals("test", TextNode.stripLeadingWhitespace("   test"));
    }

    @Test
    public void lastCharIsWhitespace() {
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder(" ")));
    }

    @Test
    public void splitText() {
        TextNode textNode = new TextNode("test");
        TextNode result1 = textNode.splitText(0);
        assertEquals("test", result1.text());

        TextNode result2 = textNode.splitText(3);
        assertEquals("", result2.text());
    }

    @Test
    public void isBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());

        TextNode textNode2 = new TextNode(" ");
        assertFalse(textNode2.isBlank());
    }

    @Test
    public void splitText() {
        TextNode textNode = new TextNode("test");
        TextNode result1 = (TextNode) textNode.splitText(0);
        assertEquals("test", result1.text());

        TextNode result2 = (TextNode) textNode.splitText(3);
        assertEquals("", result2.text());
    }

}