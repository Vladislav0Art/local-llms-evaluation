package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void textNodeShouldCreateTextNodeWithValidString() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode.text());
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void nodeNameShouldReturnTextNodeName() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void textShouldReturnTextContent() {
        TextNode textNode = new TextNode("Hello World");
        String text = textNode.text();
        assertNotNull(text);
        assertEquals("Hello World", text);
    }

    @Test
    public void textShouldSplitTextNodeIntoTwoNodes() {
        String text = "Hello\nWorld";
        TextNode textNode = new TextNode(text);
        TextNode firstChild = ((TextNode) textNode).splitText(0);
        assertNotNull(firstChild.text());
        assertEquals("Hello", firstChild.text());
        assertNotNull(((TextNode) textNode).splitText(text.length()));
    }

    @Test
    public void isBlankShouldReturnFalseForNonEmptyText() {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void isBlankShouldReturnTrueForEmptyText() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void cloneShouldCreateCopyOfTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode cloned = textNode.clone();
        assertNotNull(cloned.text());
        assertEquals("Hello World", cloned.text());
    }

    @Test
    public void createFromEncodedShouldReturnValidTextNode() throws IOException {
        String encodedText = "text";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode.text());
        assertEquals(encodedText, textNode.text());
    }

    @Test
    public void normaliseWhitespaceShouldStripLeadingWhitespace() {
        String text = "\tHello World";
        String expected = " Hello World";
        assertEquals(expected, StringUtil.normaliseWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespaceShouldRemoveLeadingWhitespace() {
        String text = "\tHello World";
        String expected = "Hello World";
        assertEquals(expected, StringUtil.stripLeadingWhitespace(text));
    }

    @Test
    public void lastCharIsWhitespaceShouldReturnTrueForWhitespacesOnly() {
        StringBuilder sb = new StringBuilder("   ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder()));
    }

}