package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTest {

    @Test
    public void TextNodeConstructorTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals("Test", textNode.getWholeText());
    }

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Lorem ipsum");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest_ShouldReturnTrimmedText() {
        TextNode textNode = new TextNode("     Lorem ipsum         ");
        assertEquals("Lorem ipsum", textNode.text());
    }

    @Test
    public void textMethodTest_ShouldSetNewText() {
        TextNode textNode = new TextNode("Lorem ipsum");
        textNode.text("Hello world");
        assertEquals("Hello world", textNode.text());
    }

    @Test
    public void getWholeTextTest_ShouldReturnOriginalText() {
        TextNode textNode = new TextNode("   Hello,     world!   ");
        assertEquals("   Hello,     world!   ", textNode.getWholeText());
    }

    @Test
    public void isBlankTest_ShouldReturnTrueForBlankTextNode() {
        TextNode textNode = new TextNode("    ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankTest_ShouldReturnFalseForNonBlankTextNode() {
        TextNode textNode = new TextNode("Lorem ipsum");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextTest_ShouldSplitTextNode() {
        TextNode textNode = new TextNode("LoremIpsum");
        TextNode newTextNode = textNode.splitText(5);
        assertEquals("Lorem", textNode.getWholeText());
        assertEquals("Ipsum", newTextNode.getWholeText());
    }

    @Test
    public void cloneTest_ShouldReturnCloneOfTextNode() {
        TextNode textNode = new TextNode("Hello, world!");
        TextNode clonedTextNode = textNode.clone();
        assertEquals(textNode.getWholeText(), clonedTextNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest_ShouldReturnTextNodeWithDecodedText() {
        TextNode textNode = TextNode.createFromEncoded("&lt;p&gt;Hello, world!&lt;/p&gt;");
        assertEquals("<p>Hello, world!</p>", textNode.getWholeText());
    }

    @Test
    public void toStringTest_ShouldReturnTheWholeText() {
        TextNode textNode = new TextNode("Lorem ipsum");
        assertEquals("Lorem ipsum", textNode.toString());
    }

    @Test
    public void outerHtmlHeadTest_ShouldReturnSameValueAsToString() throws IOException {
        TextNode textNode = new TextNode("Lorem ipsum");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("Lorem ipsum", accum.toString());
    }

    @Test
    public void outerHtmlTailTest_ShouldNotChangeTheAccum() throws IOException {
        TextNode textNode = new TextNode("");
        StringBuilder accum = new StringBuilder("Lorem ipsum");
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlTail(accum, 0, out);
        assertEquals("Lorem ipsum", accum.toString());
    }

    @Test
    public void normaliseWhitespaceTest_ShouldReturnNormalizedText() {
        String result = TextNode.normaliseWhitespace("  Lorem    ipsum dolor.  ");
        assertEquals("Lorem ipsum dolor.", result);
    }

    @Test
    public void stripLeadingWhitespaceTest_ShouldReturnTextWithoutLeadingSpaces() {
        String result = TextNode.stripLeadingWhitespace("     Lorem ipsum dolor.");
        assertEquals("Lorem ipsum dolor.", result);
    }

    @Test
    public void lastCharIsWhitespaceTest_ShouldReturnTrueWhenLastCharIsSpace() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("Lorem ipsum "));
        assertTrue(result);
    }

    @Test
    public void lastCharIsWhitespaceTest_ShouldReturnFalseWhenLastCharIsNotSpace() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("Lorem ipsum."));
        assertFalse(result);
    }

}