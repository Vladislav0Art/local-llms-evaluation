package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.jsoup.helper.Validate;

public class GeneratedTest {

    private static Document document = new Document();

    @Test
    public void testIsBlank() {
        // Test that this text node is blank -- that is, empty or only whitespace (including newlines).
        assertFalse(document.text().isBlank());
    }

    @Test
    public void testGetWholeText() {
        // Test get the (unencoded) text of this text node, including any newlines and spaces present in the original.
        assertEquals("", document.text());
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello\nWorld", textNode.getText());
    }

    @Test
    public void testSplitText() {
        // Test split this text node into two nodes at the specified string offset. After splitting, this node will contain
        // the original text up to the offset, and will have a new text node sibling containing the text after the offset.
        document = new Document();
        TextNode textNode = new TextNode("Hello World");
        textNode.splitText(5);
        assertEquals("Hello\nWorld", document.text());
    }

    @Test
    public void testOuterHtmlHead() {
        // Test outer Html head method. It checks that the output is HTML and it's pretty-printed.
        String html = "<p>Hello <span>World!</span></p>";
        Appendable appendable = new StringBuilder();
        int depth = 0;
        document.html(html, appendable, depth);
        assertEquals("<p><span>Hello World!</span></p>", appendable.toString());
        assertEquals(HTMLPrettifier.PRETTY_PRINT, document.OutputSettings.prettyPrint());
    }

    @Test
    public void testOuterHtmlTail() {
        // Test outer Html tail method. It checks that the output is HTML and it's pretty-printed.
        String html = "<p>Hello <span>World!</span></p>";
        Appendable appendable = new StringBuilder();
        int depth = 0;
        document.html(html, appendable, depth);
        assertEquals("<p><span>Hello World!</span></p>", appendable.toString());
        assertEquals(HTMLPrettifier.PRETTY_PRINT, document.OutputSettings.prettyPrint());
    }

    @Test
    public void testClone() {
        // Test that the clone method creates a new TextNode from HTML encoded (aka escaped) data.
        String encodedText = "&amp;lt;p&gt;Hello &amp; World!&amp;lt;/p&gt;";
        TextNode textNode = new TextNode(encodedText);
        assertEquals(textNode, textNode.clone());
    }

}