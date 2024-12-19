package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithRef {

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

}