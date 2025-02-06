package org.jsoup.nodes;

public class GeneratedText_RetursTextString {

    @Test
    public void text_RetursTextString() {
        // Arrange
        Document document = new Document("https://example.com");

        // Act
        String text = document.text("Hello World");

        // Assert
        assertThat(text, is(""));
    }

}