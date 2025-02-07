package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testnodeName() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("TEXT_NODE", textNode.nodeName());
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("HELLO WORLD", textNode.text());
    }

    @Test
    public void testText_WithBlank() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("HELLO WORLD", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testSplitText_WithOffset() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals(6, textNode.splitText(4).text().length());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        // Assuming DocumentOutputSettings is a mock object for testing purposes
        DocumentOutputSettings settings = new DocumentOutputSettings();
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 1;
        String output = Mockito.mock(String.class);
        settings.setOutput(accum, depth, output);

        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlHead(settings, depth, output);

        // Verify that the correct number of characters were written to the output
        assertEquals("Hello World", output.toString());
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        // Assuming DocumentOutputSettings is a mock object for testing purposes
        DocumentOutputSettings settings = new DocumentOutputSettings();
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 1;
        String output = Mockito.mock(String.class);
        settings.setOutput(accum, depth, output);

        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlTail(settings, depth, output);

        // Verify that the correct number of characters were written to the output
        assertEquals("Hello World", output.toString());
    }

    @Test
    public void testToString() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("<text>HELLO WORLD</text>", textNode.toString());
    }

    @Test
    public void testClone() {
        TextNode textNode = new TextNode("Hello World");
        TextNode clonedTextNode = textNode.clone();
        assertEquals(textNode, clonedTextNode);
    }

    @Test
    public void testCreateFromEncoded() throws Exception {
        // Assuming createFromString method is a real method of the class under test
        String encodedText = "Hello World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        assertEquals("HELLO WORLD", textNode.text());
    }

    @Test
    public void testNormaliseWhitespace() throws Exception {
        // Assuming normaliseWhitespace method is a real method of the class under test
        String text = "   Hello World   ";
        String expectedResult = "Hello World";
        assertEquals(expectedResult, TextNode.normaliseWhitespace(text));
    }

    @Test
    public void testStripLeadingWhitespace() throws Exception {
        // Assuming stripLeadingWhitespace method is a real method of the class under test
        StringBuilder sb = new StringBuilder("   Hello World   ");
        String expectedResult = "Hello World";
        assertEquals(expectedResult, TextNode.stripLeadingWhitespace(sb.toString()));
    }

    @Test
    public void testLastCharIsWhitespace() {
        // Assuming lastCharIsWhitespace method is a real method of the class under test
        StringBuilder sb = new StringBuilder("Hello World");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}