package org.jsoup.nodes;

public class GeneratedTestSplitText {

    private static String text = "Hello World";

    @Test
    public void testSplitText() {
        // Arrange
        String text = "Hello World";
        int offset = 5;
        Appendable appendable = document.append(text);

        Document.OutputSettings settings = new Document.OutputSettings();
        settings.setPrettyPrint(false);
        settings.setIndentOut(true, 0);

        TextNode.TextNode splitNode = TextNode.splitText(offset, appendable, settings);

        // Act
        appendable.clear();

        // Assert
        assertEquals("Hello", text.substring(5));
    }

}