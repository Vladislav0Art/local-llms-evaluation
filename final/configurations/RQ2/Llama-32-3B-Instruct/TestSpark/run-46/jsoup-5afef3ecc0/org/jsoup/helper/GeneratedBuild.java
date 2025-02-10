package org.jsoup.helper;

public class GeneratedBuild {

    @Test
    public void build() {
        // Arrange
        UrlBuilder builder = new UrlBuilder(null);

        // Act
        URL url = builder.build();

        // Assert
        assertNotNull(url);
    }

}