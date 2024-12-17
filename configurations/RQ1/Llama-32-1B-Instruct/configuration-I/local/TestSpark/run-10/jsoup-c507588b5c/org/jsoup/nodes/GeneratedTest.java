package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testBlankText() {
        // Arrange
        String text = "";

        // Act
        boolean isBlank = TextNode.isBlank();

        // Assert
        assertEquals(true, isBlank);
    }

    @Test
    public void testNoChildren() {
        // Arrange
        TextNode textNode = new TextNode("Hello");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = Document.OutputSettings.defaultOutputSettings();

        // Act
        textNode.outerHtmlHead(accum, 0, out);
        out.clear();
        textNode.outerHtmlTail(accum, 0, out);

        // Assert
        assertEquals("", TextNode.getWholeText());
    }

    @Test
    public void testNoSibling() {
        // Arrange
        String text = "Hello World";

        // Act
        Document.OutputSettings out = Document.OutputSettings.defaultOutputSettings();
        TextNode.text(text);

        // Assert
        assertEquals("Hello World", TextNode.getWholeText());
    }

    @Test
    public void testSibling() {
        // Arrange
        String text = "Hello\nWorld";

        // Act
        Document.OutputSettings out = Document.OutputSettings.defaultOutputSettings();
        TextNode.text(text);

        // Assert
        assertEquals("Hello \n World", TextNode.getWholeText());
    }

    @Test
    public void testSplitText() {
        // Arrange
        String text = "Hello\nWorld";
        int offset = 6;

        // Act
        TextNode result1 = TextNode.splitText(offset);
        TextNode result2 = TextNode.splitText(offset + 3);

        // Assert
        assertEquals(result1, result2);
    }

    @Test
    public void testClone() {
        // Arrange
        String text = "Hello World";

        // Act
        TextNode cloned = TextNode.clone();

        // Assert
        assertEquals(text, cloned.getWholeText());
    }

}