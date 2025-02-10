package org.jsoup.helper;

public class GeneratedAppendKeyVal_withUrl {

    @Test
    public void appendKeyVal_withUrl() throws UnsupportedEncodingException {
        // Arrange
        URL inputUrl = new URL("http://example.com");
        Connection.KeyVal kv = Connection.KeyVal.of("key", "value");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // Act
        builder.appendKeyVal(kv);

        // Assert
        assertEquals("http://example.com?key=value", StringUtil.toString(builder.build()));
    }

}