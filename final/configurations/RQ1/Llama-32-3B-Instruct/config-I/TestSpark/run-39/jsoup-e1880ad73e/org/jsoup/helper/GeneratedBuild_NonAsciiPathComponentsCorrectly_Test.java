package org.jsoup.helper;

public class GeneratedBuild_NonAsciiPathComponentsCorrectly_Test {

    @Test
    public void build_NonAsciiPathComponentsCorrectly_Test() {
        // Arrange
        URL inputUrl = new URL("http://example.com/path with non-ascii chars");

        // Act
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL outputUrl = builder.build();

        // Assert
        assertTrue(outputUrl.getPath().contains("%F0%9F%80%8D")); // correct encoding for 'with'
    }

}