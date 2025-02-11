package org.jsoup.helper;

public class GeneratedBuild_PunyCodingCorrectly_Test {

    @Test
    public void build_PunyCodingCorrectly_Test() {
        // Arrange
        URL inputUrl = new URL("http://example.com");

        // Act
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL outputUrl = builder.build();

        // Assert
        assertEquals(inputUrl, outputUrl);
    }

}