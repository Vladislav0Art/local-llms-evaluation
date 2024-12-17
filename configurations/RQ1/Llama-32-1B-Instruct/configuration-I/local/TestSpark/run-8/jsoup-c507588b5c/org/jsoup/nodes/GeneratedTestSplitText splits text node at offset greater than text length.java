package org.jsoup.nodes;

public class GeneratedTestSplitText splits text node at offset greater than text length {

    @Test
    public void testSplitText
    splits text
    node at
    offset greater
    than text

    length() {
        // Arrange
        Document doc = new Document();
        Appendable string1 = "Hello";
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        TextNode result = TextNode.splitText(10, out);

        // Assert
        assertEquals("Hello", result.text());
    }

}