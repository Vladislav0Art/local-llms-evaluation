package org.jsoup.nodes;

public class GeneratedOuterHtml_ReturnsOuterHTMLString {

    @Test
    public void outerHtml_ReturnsOuterHTMLString() {
        // Arrange
        Document document = new Document("https://example.com");

        // Act
        String outerHtml = document.outerHtml();

        // Assert
        assertThat(outerHtml, is(""));
    }

}