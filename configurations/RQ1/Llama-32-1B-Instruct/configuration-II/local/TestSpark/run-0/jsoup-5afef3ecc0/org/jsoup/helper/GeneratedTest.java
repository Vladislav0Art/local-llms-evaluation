package org.jsoup.helper;

public class GeneratedTest {

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

    @Test
    public void testAppendKeyVal_WithoutQuery() {
        // Arrange
        String key = "key";
        String value = "value";

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path"));
        urlBuilder.appendKeyVal(new KeyVal(key, value));

        // Assert
        assert (!urlBuilder.q.isEmpty());
    }

    @Test
    public void testAppendKeyValWithQuery() {
        // Arrange
        String key = "key";
        String value = "value";

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path"));
        urlBuilder.appendKeyVal(new KeyVal(key, value));

        // Assert
        assert (!urlBuilder.q.isEmpty());
    }

    @Test
    public void testAppendKeyVal_WithoutRef() {
        // Arrange
        String key = "key";
        String value = "value";

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path"));
        urlBuilder.appendKeyVal(new KeyVal(key, value));

        // Assert
        assert (!urlBuilder.q.contains("#anchor"));
    }

    @Test
    public void testAppendKeyVal_WithRef() {
        // Arrange
        String key = "key";
        String ref = "#anchor";

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path"));
        urlBuilder.appendKeyVal(new KeyVal(key, value));

        // Assert
        assert (!urlBuilder.q.contains("#anchor"));
    }

    @Test
    public void testUrlBuilder_WithNullInput() {
        // Arrange
        String inputUrl = null;

        // Act and Assert
        try {
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            urlBuilder.build();
            fail("Expected exception not thrown");
        } catch (MalformedURLException e) {
            assert (true);
        }
    }

}