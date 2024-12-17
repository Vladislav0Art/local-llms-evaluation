package org.jsoup.nodes;

public class GeneratedTest {

    private String value;

    public TextNode(String value) {
        this.value = value;
    }

    public String getWholeText() {
        return value;
    }

    public String splitText(int offset) throws IllegalArgumentException {
        if (offset 0 || offset > value.length()){
            throw new IllegalArgumentException("Offset is out of bounds");
        }
        return value.substring(0, offset);
    }

    public boolean isBlank() {
        return value.isEmpty();
    }

    public String getValue() {
        return value;
    }
}

public class GeneratedTest {

    @Test
    public void testCreateTextNode_GivenRawText_ReturnsNewTextNode() {
        String rawText = "Hello World!";
        TextNode textNode = new TextNode(rawText);
        assertNotNull(textNode);
        assertEquals(rawText, textNode.getWholeText());
    }

    @Test
    public void testGetWholeText_GivenNonEmptyText_ReturnsCorrectText() {
        String rawText = "Hello World!";
        TextNode textNode = new TextNode(rawText);
        assertEquals(rawText, textNode.getWholeText());
    }

    @Test
    public void testGetWholeText_GivenEmptyText_ReturnsEmptyString() {
        String rawText = "";
        TextNode textNode = new TextNode(rawText);
        assertEquals("", textNode.getWholeText());
    }

    @Test
    public void testSplitText_GivenValidOffset_ReturnsNewTextNode() throws IllegalArgumentException {
        String rawText = "Hello World!";
        int offset = 6;
        TextNode textNode = new TextNode(rawText);
        String result = textNode.splitText(offset);
        assertNotNull(result);
        assertEquals("World", result);
    }

    @Test
    public void testSplitText_GivenInvalidOffset_ThrowsIllegalArgumentException() throws IllegalArgumentException {
        String rawText = "Hello World!";
        int offset = -1;
        TextNode textNode = new TextNode(rawText);
        try {
            textNode.splitText(offset);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Offset is out of bounds", e.getMessage());
        }
    }

    @Test
    public void testIsBlank_GivenNonEmptyText_ReturnsFalse() {
        String rawText = "Hello World!";
        TextNode textNode = new TextNode(rawText);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void testIsBlank_GivenEmptyText_ReturnsTrue() {
        String rawText = "";
        TextNode textNode = new TextNode(rawText);
        assertTrue(textNode.isBlank());
    }

}