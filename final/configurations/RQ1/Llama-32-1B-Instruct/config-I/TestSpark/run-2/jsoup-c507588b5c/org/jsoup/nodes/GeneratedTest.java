package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testIsBlank_EmptyText() {
        // Arrange
        String text = "";

        // Act
        boolean result = nodeIsBlank();

        // Assert
        assertTrue(result, "nodeIsBlank() returned unexpected result");
    }

    @Test
    public void testIsBlank_OnlyWhitespace() {
        // Arrange
        String text = "   ";

        // Act
        boolean result = nodeIsBlank();

        // Assert
        assertTrue(result, "nodeIsBlank() returned unexpected result");
    }

    @Test
    public void testGetWholeText_Splitting() {
        // Arrange
        String text = "Hello   World";

        // Act
        String wholeText = nodeGetWholeText();

        // Assert
        assertEquals("Hello World", wholeText, "nodeGetWholeText() returned unexpected result");
    }

    @Test
    public void testSplitText_AddingNewNode() {
        // Arrange
        TextNode textNode = createFromEncoded("&amp;lt;");
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        TextNode result = textNode.splitText(10);

        // Assert
        assertTrue(result != null, "splitText() returned unexpected result");
    }

    @Test
    public void testGetWholeText_Splitting_NoNewNode() {
        // Arrange
        String text = "&amp;lt;";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        TextNode result = nodeGetWholeText();

        // Assert
        assertTrue(result != null, "nodeGetWholeText() returned unexpected result");
    }

    @Test
    public void testClone_FieldsArePreserved() {
        // Arrange
        String text1 = "Hello";
        String text2 = " World";

        TextNode node1 = createFromEncoded(text1);
        TextNode node2 = node1.clone();

        // Act
        node2.setText(text2);

        // Assert
        assertEquals(text1, node1.getText(), "nodeGetWholeText() returned unexpected result");
    }

    @Test
    public void testToString_FieldsArePreserved() {
        // Arrange
        String text = "Hello";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        TextNode node = createFromEncoded(text);

        // Act
        String result = node.toString();

        // Assert
        assertEquals("Hello", result, "nodeToString() returned unexpected result");
    }

}