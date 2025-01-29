package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        // Arrange
        String key = "key";
        String value = "value";

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(new Connection());
        urlBuilder.appendKeyVal(new KeyVal(key, value));
        URL outputUrl = urlBuilder.build();

        // Assert
        assert !outputUrl.toString().isEmpty();
    }

}