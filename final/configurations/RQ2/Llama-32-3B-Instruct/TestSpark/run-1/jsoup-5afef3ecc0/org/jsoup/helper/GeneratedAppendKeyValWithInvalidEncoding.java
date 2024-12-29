package org.jsoup.helper;

public class GeneratedAppendKeyValWithInvalidEncoding {

    @Test
    public void appendKeyValWithInvalidEncoding() {
        // Arrange
        Connection.KeyVal kv = new Connection.KeyVal("key", "invalid encoded value");

        // Act and Assert
        assertThrows(UnsupportedEncodingException.class, () -> {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
            urlBuilder.appendKeyVal(kv);
            urlBuilder.build().toString();
        });
    }

}