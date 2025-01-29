package org.jsoup.nodes;

public class GeneratedTest.

nodeName {

    @Test
    public void test.nodeName() {
        // Arrange
        Document document = new Document();
        Appendable appender = document.createDocumentFragment();
        String text = "Hello, World!";
        String expectedName = "text";

        // Act
        TextNode textNode = new TextNode(text);

        // Assert
        assertEquals(expectedName, textNode.nodeName());
    }

}