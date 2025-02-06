package org.jsoup.nodes;

public class GeneratedNodeName_ReturnsNodeNameString {

    @Test
    public void nodeName_ReturnsNodeNameString() {
        // Arrange
        Document document = new Document("https://example.com");

        // Act
        String nodeName = document.nodeName();

        // Assert
        assertThat(nodeName, is(""));
    }

}