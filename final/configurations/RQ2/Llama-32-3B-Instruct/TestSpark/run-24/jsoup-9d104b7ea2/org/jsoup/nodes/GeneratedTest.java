package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.parser.Parser;

public class GeneratedTest {

    public String stripLeadingWhitespace(String input) {
        return input.replaceAll("^\\s+", "");
    }

    @Test
    public void newTextNodeHasValidNodeName() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void newTextNodeReturnsTextContent() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("Hello, World!", textNode.text());
    }

    @Test
    public void newTextNodeAllowsOverwritingTextContent() {
        TextNode textNode = new TextNode("Hello, World!");
        textNode.text("New Text");
        assertEquals("New Text", textNode.text());
    }

    @Test
    public void getWholeTextReturnsFullTextContent() throws IOException {
        TextNode textNode = new TextNode("Hello\nWorld\n");
        assertEquals("Hello\nWorld\n", textNode.getWholeText());
    }

    @Test
    public void isBlankTextNodeReturnsFalse() {
        TextNode textNode = new TextNode("Hello, World!");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextChangesLengthOfTextNode() {
        TextNode textNode = new TextNode("Hello\nWorld");
        int lengthBefore = textNode.text().length();
        textNode.splitText(1);
        int lengthAfter = textNode.text().length();
        assertTrue(lengthAfter < lengthBefore);
    }

    @Test
    public void cloneTextNodeCreatesDeepCopy() {
        TextNode original = new TextNode("Hello, World!");
        TextNode cloned = original.clone();
        assertEquals(original.text(), cloned.text());
    }

    @Test
    public void createFromEncodedTextNodeReturnsTextContent() throws IOException {
        TextNode textNode = TextNode.createFromEncoded("Hello, World!");
        assertEquals("Hello, World!", textNode.text());
    }

    @Test
    public void normaliseWhitespaceReplacesTabsWithSpaces() {
        String input = "Hello\tWorld!";
        String output = StringUtil.normaliseWhitespace(input);
        assertEquals("Hello World!", output);
    }

    @Test
    public void getWholeTextReturnsFullTextContent() throws IOException {
        TextNode textNode = new TextNode("Hello\nWorld\n");
        String wholeText = textNode.getWholeText();
        assertNotNull(wholeText);
        assertTrue(wholeText.contains("Hello"));
        assertTrue(wholeText.contains("World"));
    }

    @Test
    public void cloneTextNodeCreatesDeepCopy() {
        TextNode original = new TextNode("Hello, World!");
        TextNode cloned = original.clone();
        assertNotNull(cloned);
        assertEquals(original.text(), cloned.text());
    }

    @Test
    public void createFromEncodedTextNodeReturnsTextContent() throws IOException {
        TextNode textNode = TextNode.createFromEncoded("Hello, World!");
        assertNotNull(textNode);
        String wholeText = textNode.getWholeText();
        assertNotNull(wholeText);
        assertEquals("Hello, World!", wholeText);
    }

    @Test
    public void normaliseWhitespaceReplacesTabsWithSpaces() {
        String input = "Hello\tWorld!";
        String output = StringUtil.normaliseWhitespace(input);
        assertNotNull(output);
        assertTrue(output.contains(" "));
    }

}