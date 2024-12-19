package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceReturnsFalseForNonWhitespaceCharacterTest {

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