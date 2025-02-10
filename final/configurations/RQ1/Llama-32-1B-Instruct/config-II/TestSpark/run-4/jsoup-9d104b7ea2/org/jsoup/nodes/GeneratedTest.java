package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTest {

    @Test
    public void testBlank() {
        TextNode textNode = new TextNode("");
        assertEquals(true, textNode.isBlank());
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("   \n\t\r\n  ");
        assertEquals(true, textNode.isBlank());
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("<a>hello</a>");
        assertEquals("hello", textNode.getText());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("<p>hello <span>world</span></p>");
        TextNode result = textNode.splitText(10);
        assertEquals(new TextNode("<p>hello<span> world</span></p>"), result);
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        TextNode textNode = new TextNode("<a>hello <span>world</span></a>");
        textNode.outerHtmlHead(Appendable.create(), 0, Document.OutputSettings.PRETTY_PRINT);
        assertEquals("<html><head><body><a>Hello <span>World</span></a></body></html>", textNode.toString());
    }

    @Test
    public void testToString() {
        TextNode textNode = new TextNode("<a>hello <span>world</span></a>");
        String expectedString = "<a>hello <span>world</span></a>";
        assertEquals(expectedString, textNode.toString());
    }

    @Test
    public void testClone() {
        TextNode textNode = new TextNode("<a>hello <span>world</span></a>");
        TextNode clonedTextNode = (TextNode) textNode.clone();
        assertEquals(textNode, clonedTextNode);
    }

    @Test
    public void testCreateFromEncoded() {
        TextNode textNode = new TextNode("<a>hello <span>world</span></a>");
        String encodedText = "<a>Hello<span> World</span></a>";
        TextNode result = TextNode.createFromEncoded(encodedText);
        assertEquals(textNode, result);
    }

    @Test
    public void testEntitiesEscape() throws IOException {
        TextNode textNode = new TextNode("<a>hello <span>world</span></a>");
        String expectedString = "<a>Hello<span> World</span></a>";
        assertEquals(expectedString, textNode.getText());
        textNode.setText("Hello<Span>World</Span>");
        assertEquals(expectedString, textNode.getText());
    }

    @Test
    public void testNormaliseWhitespace() {
        TextNode textNode = new TextNode("<a>hello <span>world</span></a>");
        String expectedString = "<a>Hello <span>World</span></a>";
        assertEquals(expectedString, textNode.getText());
    }

    @Test
    public void testLastCharIsWhitespace() {
        TextNode textNode = new TextNode("   \n\t\r\n  ");
        boolean result = lastCharIsWhitespace(new StringBuilder(textNode));
        assertTrue(result);
    }

}