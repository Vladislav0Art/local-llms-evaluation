package org.jsoup.nodes;

public class GeneratedTitle_ReturnsTitleString {

    @Test
    public void title_ReturnsTitleString() {
        // Arrange
        Document document = new Document("https://example.com");

        // Act
        String title = document.title();

        // Assert
        assertThat(title, is(""));
    }

}