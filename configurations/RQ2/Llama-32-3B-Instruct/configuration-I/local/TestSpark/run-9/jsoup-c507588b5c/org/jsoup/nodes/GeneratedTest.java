package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void newNodeTextTest() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void textMethodReturnsUnencodedTextTest() {
        TextNode textNode = new TextNode("Hello &amp; World");
        assertEquals("Hello & World", textNode.text());
    }

    @Test
    public void newNodeWholeTextReturnsFullStringTest() {
        TextNode textNode = new TextNode("Hello\nWorld");
        assertEquals("Hello\nWorld", textNode.getWholeText());
    }

    @Test
    public void isBlankMethodReturnsFalseForNonBlankTextNodeTest() {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void isBlankMethodReturnsTrueForBlankTextNodeTest() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextMethodCreatesNewTextNodeAtCorrectOffsetTest() throws IOException {
        Document document = new Document("<html>Hello World\nThis is a test</html>");
        Appendable accum = new StringBuilder();
        int offset = 7;
        TextNode originalTextNode = textNodeFromHtml(document, "html");
        TextNode textNode = originalTextNode.splitText(offset);
        assertEquals("Hello World", textNode.text());
        assertEquals("\nThis is a test", originalTextNode.text());
    }

    @Test
    public void createFromEncodedMethodCreatesNewTextNodeWithUnencodedTextTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;Hello&gt; &amp; World");
        assertEquals("Hello & World", textNode.text());
    }

    @Test
    public void normaliseWhitespaceRemovesLeadingWhitespaceTest() {
        String input = "   Hello World";
        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, TextNode.normaliseWhitespace(input));
    }

    @Test
    public void stripLeadingWhitespaceRemovesLeadingWhitespaceTest() {
        String input = "   Hello World";
        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, TextNode.stripLeadingWhitespace(input));
    }

    @Test
    public void lastCharIsWhitespaceReturnsFalseForNonWhitespaceCharacterTest() {
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder("a")));
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder("b")));
    }
}

public class Document {
    public static Document of(String html) {
        // implementation to create a document from HTML
        return null;
    }
}

public class TextNode {
    public TextNode(String text) {
        this.text = text;
    }

    public String text;

    public static TextNode textNodeFromHtml(Document document, String tagName) {
        // implementation to create a text node from an HTML document and tag name
        return null;
    }

    public TextNode splitText(int offset) {
        // implementation to split the text at the given offset
        return null;
    }

}