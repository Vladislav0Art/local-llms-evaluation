package org.jsoup.helper;

public class GeneratedAppendKeyValWithValidKeyVal {

    @Test
    public void appendKeyValWithValidKeyVal() {
        // Arrange
        Connection.KeyVal kv = new Connection.KeyVal("key", "val");

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(kv);
        String result = urlBuilder.build().toString();

        // Assert
        assertEquals("http://example.com?key=val", result);
    }

}