package org.jsoup.helper;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        // Arrange
        URL inputUrl = new URL("http://example.com/path?query=value#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL outputUrl = urlBuilder.build();

        // Assert
        assert !outputUrl.toString().isEmpty();
    }

}