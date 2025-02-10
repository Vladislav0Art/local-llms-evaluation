package org.jsoup.helper;

public class GeneratedAppendKeyVal {

    @Test
    public void appendKeyVal() throws UnsupportedEncodingException {
        // Arrange
        Connection.KeyVal kv = Connection.KeyVal.of("key", "value");
        UrlBuilder builder = new UrlBuilder(null);

        // Act
        builder.appendKeyVal(kv);

        // Assert
        assertEquals("http://example.com?key=value", StringUtil.toString(builder.build()));
    }

}