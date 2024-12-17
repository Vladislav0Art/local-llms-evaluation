package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    public Document createDocument(String html) {
        return new org.jsoup.nodes.Document.Builder().html(html).build();
    }

    @Test
    public void newNodeByTextTest() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
    }

    @Test
    public void nodeNameMethodReturnsCorrectValueTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void textMethodReturnsCorrectValueTest() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void setNewTextMethodSetsCorrectValueTest() {
        String newText = "New Test";
        TextNode textNode = new TextNode("Old Test");
        textNode.text(newText);
        assertEquals(newText, textNode.text());
    }

    @Test
    public void getWholeTextReturnsCorrectValueTest() {
        TextNode textNode = new TextNode("Hello World\nThis is a test");
        assertEquals("Hello World\nThis is a test", textNode.getWholeText());
    }

    @Test
    public void isBlankMethodReturnsFalseWhenTextIsPresentTest() {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void isBlankMethodReturnsTrueWhenOnlyWhitespaceIsPresentTest() {
        TextNode textNode = new TextNode("\n\n");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitTextMethodSplittingCorrectlyTest() throws IOException {
        String text = "Hello World";
        int offset = 5;
        Document document = createDocument("text=" + text);
        Element parentElement = (Element) document.head().firstChild();
        TextNode parentTextNode = new TextNode(parentElement.text());
        assertEquals(parentTextNode, parentTextNode.splitText(offset).parent());
    }

    @Test
    public void cloneMethodCreatesNewCopyOfTextNodeTest() {
        TextNode original = new TextNode("Hello World");
        TextNode cloned = original.clone();
        assertNotNull(cloned);
        assertEquals(original, cloned.parent());
    }

    @Test
    public void createFromEncodedMethodUnescapesCorrectlyTest() throws IOException {
        String encodedText = "&lt;Hello&gt; World";
        Document documentBuilder = new org.jsoup.nodes.Document.Builder().html("text=" + encodedText).build();
        Element element = (Element) documentBuilder.head().firstChild();
        TextNode textNode = new TextNode(element.text());
        assertEquals("&lt;Hello&gt; World", textNode.text());
    }

    @Test
    public void normaliseWhitespaceMethodCorrectlyRemovesExtraSpaces() {
        String originalText = "   Hello   World  ";
        String expectedText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        assertEquals(expectedText, textNode.text());
    }

}