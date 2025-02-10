package org.jsoup.helper;

public class GeneratedBuild_withInputUrl {

    @Test
    public void build_withInputUrl() {
        // Arrange
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // Act
        URL url = builder.build();

        // Assert
        assertEquals(inputUrl, url);
    }

}