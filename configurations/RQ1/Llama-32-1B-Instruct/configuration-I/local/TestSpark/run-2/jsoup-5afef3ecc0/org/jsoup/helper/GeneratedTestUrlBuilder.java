package org.jsoup.helper;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() {
        // Arrange
        String inputUrl = "https://example.com/path?query=string&ref=%20";
        UrlBuilder builder = new UrlBuilder(new URI(inputUrl));
        URL normalizedUrl = builder.build();

        // Act
        assert normalizedUrl.toString().startsWith("https://example.com/path");
    }

}