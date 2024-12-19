package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithoutRef {

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

}