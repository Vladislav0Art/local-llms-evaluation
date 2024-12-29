package org.jsoup.helper;

public class GeneratedAppendKeyValWithNullValue {

    @Test
    public void appendKeyValWithNullValue() {
        // Arrange
        Connection.KeyVal kv = new Connection.KeyVal("key", null);

        // Act and Assert
        assertThrows(NullPointerException.class, () -> {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
            urlBuilder.appendKeyVal(kv);
            urlBuilder.build().toString();
        });
    }

}