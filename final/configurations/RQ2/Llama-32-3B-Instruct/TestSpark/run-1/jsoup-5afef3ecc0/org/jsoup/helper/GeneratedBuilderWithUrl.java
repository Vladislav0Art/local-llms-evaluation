package org.jsoup.helper;

public class GeneratedBuilderWithUrl {

    @Test
    public void builderWithUrl() {
        // Arrange
        URL inputUrl = new URL("http://example.com");

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String result = urlBuilder.build().toString();

        // Assert
        assertEquals("http://example.com", result);
    }

}