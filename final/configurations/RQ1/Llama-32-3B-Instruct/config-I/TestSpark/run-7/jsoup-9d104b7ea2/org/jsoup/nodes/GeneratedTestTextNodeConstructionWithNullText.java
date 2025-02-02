package org.jsoup.nodes;

public class GeneratedTestTextNodeConstructionWithNullText {

    public interface NodeVisitor {
        void visit(Node node);
    }

    public static class GeneratedTest extends org.junit.jupiter.api.Test {

        @Test
        public void testTextNodeConstructionWithNullText() {
            // Arrange
            String text = null;
            TextNode node = new TextNode(text);

            // Act & Assert
            assertNotNull(node);
            assertEquals(null, node.getText());
            assertTrue(node.isBlank());
            assertEquals(0, node.getText().length());

            try {
                node.splitText(0);
                fail("Expected NullPointerException");
            } catch (NullPointerException e) {
            }

        }

    }

}

public class TextNode {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public boolean isBlank() {
        return text.isEmpty();
    }

    public void splitText(int offset) throws IllegalArgumentException {
    }

}