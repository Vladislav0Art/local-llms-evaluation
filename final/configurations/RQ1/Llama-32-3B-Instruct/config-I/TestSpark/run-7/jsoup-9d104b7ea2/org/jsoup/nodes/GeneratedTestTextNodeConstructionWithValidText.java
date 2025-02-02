package org.jsoup.nodes;

public class GeneratedTestTextNodeConstructionWithValidText {

    public interface NodeVisitor {
        void visit(Node node);
    }

    public static class GeneratedTest extends org.junit.jupiter.api.Test {

        @Test
        public void testTextNodeConstructionWithValidText() {
            // Arrange
            String text = "Hello World";
            TextNode node = new TextNode(text);

            // Act & Assert
            assertEquals(text, node.getText());
            assertFalse(node.isBlank());
            assertEquals(1, node.getText().length());

            try {
                node.splitText(0);
                fail("Expected NullPointerException");
            } catch (IllegalArgumentException e) {
            }
        }

    }