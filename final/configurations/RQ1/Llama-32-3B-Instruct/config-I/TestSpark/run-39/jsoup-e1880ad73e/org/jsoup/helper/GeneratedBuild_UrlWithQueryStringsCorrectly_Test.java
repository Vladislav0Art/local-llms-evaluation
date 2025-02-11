package org.jsoup.helper;

public class GeneratedBuild_UrlWithQueryStringsCorrectly_Test {

    @Test
    public void build_UrlWithQueryStringsCorrectly_Test() {
        // Arrange
        URL inputUrl = new URL("http://example.com/path?query=with+spaces#anchor");

        // Act
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL outputUrl = builder.build();

        // Assert
        assertEquals(outputUrl, new URL("http://example.com/path?query=with%20spaces#anchor"));
    }

}