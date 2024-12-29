package org.jsoup.helper;

public class GeneratedAppendKeyValWithNullKey {

    @Test
    public void appendKeyValWithNullKey() {
        // Arrange
        Connection.KeyVal kv = new Connection.KeyVal(null, "val");

        // Act and Assert
        assertThrows(NullPointerException.class, () -> {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
            urlBuilder.appendKeyVal(kv);
            urlBuilder.build().toString();
        });
    }

}