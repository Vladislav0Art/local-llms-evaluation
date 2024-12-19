package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testNonBlank() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void testSplitText0() {
        TextNode textNode = new TextNode("Hello\nWorld!");
        TextNode result = textNode.splitText(0);
        assertEquals(result, new TextNode(""));
    }

    @Test
    public void testSplitText1() {
        String text = "Hello\nWorld!";
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(2);
        assertEquals(result, new TextNode("Hello"));
    }

    @Test
    public void testSplitTextNegativeOffset() throws IOException {
        TextNode textNode = new TextNode("Hello\nWorld!");
        TextNode result = textNode.splitText(-3);
        assertFalse(result.isBlank());
    }

    @Test
    public void testSplitTextPositiveOffset0() {
        String text = "Hello\nWorld!";
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(4);
        assertEquals(new TextNode("Hello"), result);
    }

    @Test
    public void testSplitTextNegativeOffset1() throws IOException {
        TextNode textNode = new TextNode("Hello\nWorld!");
        TextNode result = textNode.splitText(-2);
        assertTrue(result.isBlank());
    }

    @Test
    public void testGetWholeText() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

    @Test
    public void testTrimLeadingWhitespace0() {
        String text = "   Hello   World!  ";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testTrimTrailingWhitespace1() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        // Test that the head is created correctly, with leading and trailing whitespace removed.
        TextNode textNode = new TextNode("Hello World!");
        String result = textNode.outerHtmlHead(Appendable.get(), 0, Document.OutputSettings.prettyPrint());
        assertEquals("<text>", result);
    }

    @Test
    public void testClone() {
        TextNode original = new TextNode("Hello World!");
        TextNode cloned = original.clone();
        assertTrue(original != cloned);
        assertEquals(original, cloned);
    }

}