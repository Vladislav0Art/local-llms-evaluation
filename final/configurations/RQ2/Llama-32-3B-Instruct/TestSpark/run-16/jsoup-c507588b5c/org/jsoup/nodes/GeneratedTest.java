package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeNameReturnsTextNode() {
        assertEquals(TextNode.class, new TextNode("test").nodeName());
    }

    @Test
    public void textReturnsTextContent() {
        TextNode textNode = new TextNode("Hello World");
        String expectedText = "Hello World";
        assertEquals(expectedText, textNode.text());
    }

    @Test
    public void textOverwritesExistingText() {
        TextNode textNode = new TextNode("Initial Text");
        textNode.text("New Text");
        String expectedText = "New Text";
        assertEquals(expectedText, textNode.text());
    }

    @Test
    public void getWholeTextReturnsCompleteTextContent() {
        TextNode textNode = new TextNode("Hello World");
        String expectedText = "Hello World";
        assertEquals(expectedText, textNode.getWholeText());
    }

    @Test
    public void isBlankReturnsTrueForEmptyString() {
        assertTrue(TextNode.class.newInstance().isBlank());
    }

    @Test
    public void splitTextSplitsTextAtOffset() {
        TextNode textNode = new TextNode("Hello World");
        textNode.splitText(6);
        String[] expectedSplit = {"Hello", "World"};
        assertEquals(expectedSplit, textNode.toString().split(" "));
    }

    @Test
    public void outerHtmlHeadGeneratesCorrectOutput() throws IOException {
        StringBuilder accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("<p>Hello World!</p>");
        textNode.outerHtmlHead(accum, depth, out);
        String expectedOutput = "<html><body><p>Hello World!</p></body></html>";
        assertEquals(expectedOutput, accum.toString());
    }

    @Test
    public void outerHtmlTailGeneratesCorrectOutput() {
        StringBuilder accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("<p>Hello World!</p>");
        textNode.outerHtmlTail(accum, depth, out);
        String expectedOutput = "</body></html>";
        assertEquals(expectedOutput, accum.toString());
    }

    @Test
    public void cloneCreatesCopy() {
        TextNode original = new TextNode("Original Text");
        TextNode cloned = original.clone();
        assertNotNull(cloned);
        assertEquals(original.text(), cloned.text());
    }

    @Test
    public void createFromEncodedCreatesTextFromEncodedString() {
        String encodedText = "Hello World!";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        String expectedText = encodedText;
        assertEquals(expectedText, textNode.text());
    }

}