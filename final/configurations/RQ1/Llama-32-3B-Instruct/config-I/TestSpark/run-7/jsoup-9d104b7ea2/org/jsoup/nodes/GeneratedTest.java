package org.jsoup.nodes;

public class GeneratedTest {

    private String text;

    public Node(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public boolean isBlank() {
        return text.isEmpty();
    }
}

public class TestNode {

    @Test
    public void testTextNodeConstructionWithValidText() {
        // Arrange
        String text = "Hello World";
        TextNode node = new TextNode(text);

        // Act & Assert
        assertEquals(text, node.text());
        assertFalse(node.isBlank());
        assertEquals(1, node.text().length());

        try {
            node.splitText(0);
            fail("Expected NullPointerException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testTextNodeConstructionWithBlankText() {
        // Arrange
        String text = "";
        TextNode node = new TextNode(text);

        // Act & Assert
        assertEquals("", node.text());
        assertTrue(node.isBlank());
        assertEquals(0, node.text().length());

        try {
            node.splitText(0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

}