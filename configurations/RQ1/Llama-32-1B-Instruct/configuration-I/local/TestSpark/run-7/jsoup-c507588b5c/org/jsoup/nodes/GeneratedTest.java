package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testIsBlank() {
        // Test that isBlank returns true if this document is empty or only whitespace
        TextNode doc = new TextNode("");
        assertTrue(doc.isBlank());

        // Test that isBlank returns false if it contains any text content
        TextNode doc2 = new TextNode("Hello World");
        assertFalse(doc2.isBlank());
    }

    @Test
    public void testGetWholeText() {
        // Test that getWholeText returns unencoded, normalised text
        TextNode doc = new TextNode("<p>Hello <b>World</b></p>");
        assertEquals("Hello <b>World</b>", doc.getText());
    }

    @Test
    public void testSplitText() {
        // Test that splitText splits the text into two nodes at the specified string offset
        TextNode doc = new TextNode("<p>Hello World!</p>");
        TextNode tail = doc.splitText(6);
        assertEquals("Hello ", tail.getText());
        assertNotNull(tail.getParent());
    }

    @Test
    public void testOuterHtmlHead() {
        // Test that outerHtmlHead adds the correct indent when the text is not blank and the next node will cause an indent
        TextNode doc = new TextNode("<p>Hello World!</p>");
        Document document = new Document();
        Appendable accum = document.getAppendable().createBuffer(0, 10);
        indent(accum, 0, document, true);
        assertTrue(StripLeadingWhitespace(accum.toString()).contains("Hello "));
    }

    @Test
    public void testOuterHtmlTail() {
        // Test that outerHtmlTail does not add any content to the appendable when there are no sibling nodes
        TextNode doc = new TextNode("");
        Document document = new Document();
        Appendable accum = document.getAppendable().createBuffer(0, 10);
        indent(accum, 0, document, false);
        assertEquals("", StripLeadingWhitespace(accum.toString()));
    }

    @Test
    public void testGetWholeTextFromNode() {
        // Test that getWholeText returns the correct text from a TextNode (including newlines and spaces)
        TextNode doc = new TextNode("<p>Hello World!</p>");
        String expected = "Hello World!";
        assertEquals(expected, doc.getText());
    }

    @Test
    public void testIsBlankFromNode() {
        // Test that isBlank returns true if this document is empty or only whitespace from a TextNode (including newlines and spaces)
        TextNode doc = new TextNode("");
        assertTrue(doc.isBlank());

        // Test that isBlank returns false if it contains any text content
        TextNode doc2 = new TextNode("Hello World!");
        assertFalse(doc2.isBlank());
    }

}