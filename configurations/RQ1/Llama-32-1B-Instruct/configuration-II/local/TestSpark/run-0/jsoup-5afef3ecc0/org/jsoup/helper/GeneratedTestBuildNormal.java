package org.jsoup.helper;

public class GeneratedTestBuildNormal {

    @Test
    public void testBuildNormal() {
        // Arrange
        URL inputUrl = new URL("https://example.com/path?query=value#anchor");

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL normalisedUrl = urlBuilder.build();

        // Assert
        assert (normalisedUrl.getProtocol().equals("https"));
        assert (normalisedUrl.getHost().contains("example.com"));
        assert (!normalisedUrl.getPath().isEmpty());
    }

}