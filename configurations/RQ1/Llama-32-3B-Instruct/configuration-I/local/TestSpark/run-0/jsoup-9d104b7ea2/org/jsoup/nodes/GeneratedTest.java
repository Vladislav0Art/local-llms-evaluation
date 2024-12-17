package org.jsoup.nodes;

public class GeneratedTest {

    private String text;

    public static TextNode createFromEncoded(String encodedText) throws IOException {
        // implementation to decode and return a new TextNode
        return new TextNode(encodedText);
    }

    public boolean isBlank() {
        return text.isEmpty();
    }

    public String splitText(int offset) {
        if (offset >= 0 && offset <= text.length()) {
            return text.substring(offset);
        }
        throw new IndexOutOfBoundsException("Offset out of range");
    }

    @Override
    public String toString() throws IOException {
        // implementation to generate the outer HTML
        return "text=" + text;
    }

    public String getText() {
        return text;
    }
}

public class GeneratedTest {

    @Test
    public void newTextNode_GivenText_ReturnsTextNode() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertNotNull(node);
        assertEquals(text, node.text());
    }

    @Test
    public void nodeName_ReturnsCorrectValue() {
        TextNode node = new TextNode("");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void text_GivenText_ReturnsUnencodedText() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

    @Test
    public void isBlank_GivenText_ReturnsFalse() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
    }

    @Test
    public void isBlank_GivenEmptyString_ReturnsTrue() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void splitText_GivenInvalidOffset_ThrowsException() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        int offset = -1;
        try {
            node.splitText(offset);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void clone_ReturnsCorrectTextNode() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals(text, cloned.text());
    }

}