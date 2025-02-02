package org.jsoup.nodes;

public class GeneratedTestTextNodeConstructionWithBlankText {

    public interface NodeVisitor {
        void visit(Node node);
    }

    public static class GeneratedTest extends org.junit.jupiter.api.Test {

        @Test
        public void testTextNodeConstructionWithBlankText() {
            // Arrange
            String text = "";
            TextNode node = new TextNode(text);

            // Act & Assert
            assertEquals("", node.getText());
            assertTrue(node.isBlank());
            assertEquals(0, node.getText().length());

            try {
                node.splitText(0);
                fail("Expected IllegalArgumentException");
            } catch (IllegalArgumentException e) {
            }
        }

    }