package org.jsoup.helper;

public class GeneratedBuildUrlWithoutQueryString {

    @Test
    public void buildUrlWithoutQueryString() {
        // Arrange
        URL inputUrl = new URL("https://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL result = urlBuilder.build();

        // Assert
        assertEquals(inputUrl, result);
    }

}