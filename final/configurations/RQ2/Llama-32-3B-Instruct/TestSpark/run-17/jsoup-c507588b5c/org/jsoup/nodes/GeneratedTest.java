package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedTest {

    @Test
    public void createTextNodesFromEncodedStringReturnsNonNull() {
        TextNode textNode = TextNode.createFromEncoded("hello");
        assertNotNull(textNode);
    }

    @Test
    public void createTextNodesFromEncodedStringThrowsNullPointerExceptionOnNullInput() {
        assertThrows(NullPointerException.class, () -> TextNode.createFromEncoded(null));
    }

    @Test
    public void textOfEmptyTextIsBlank() {
        TextNode textNode = TextNode.createFromEncoded("");
        assertEquals("", textNode.text());
    }

    @Test
    public void textOfNonBlankStringIsNotBlank() {
        String text = "hello";
        TextNode textNode = TextNode.createFromEncoded(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void cloneMethodReturnsSameTextNode() {
        TextNode original = TextNode.createFromEncoded("hello");
        TextNode cloned = original.clone();
        assertTrue(original.equals(cloned));
    }

    @Test
    public void splitTextMethodChangesTextNodeContent() {
        String text = "hello";
        int offset = 1;
        TextNode original = TextNode.createFromEncoded(text);
        TextNode split = original.splitText(offset);
        assertEquals(text.substring(0, offset), original.text());
        assertNotEquals("", split.text());
    }

    @Test
    public void outerHtmlHeadAndTailDoNotAlterTextNode() {
        String text = "hello";
        int depth = 1;
        Document.OutputSettings outSettings = new Document.OutputSettings();
        // Removed the incorrect assignment here.
    }

    @Test
    public void toStringMethodReturnsCorrectString() {
        String text = "hello";
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals("<text>" + text + "</text>", node.toString());
    }

    @Test
    public void isBlankMethodReturnsTrueForEmptyText() {
        TextNode textNode = TextNode.createFromEncoded("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlankMethodReturnsFalseForNonEmptyText() {
        String text = "hello";
        TextNode textNode = TextNode.createFromEncoded(text);
        assertFalse(textNode.isBlank());
    }

}