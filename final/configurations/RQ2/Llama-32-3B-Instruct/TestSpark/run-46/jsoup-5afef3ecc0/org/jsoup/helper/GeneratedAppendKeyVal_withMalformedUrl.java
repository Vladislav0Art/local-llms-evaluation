package org.jsoup.helper;

public class GeneratedAppendKeyVal_withMalformedUrl {

    @Test
    public void appendKeyVal_withMalformedUrl() throws UnsupportedEncodingException {
        // Arrange
        URL inputUrl = new URL("invalid://url");
        Connection.KeyVal kv = Connection.KeyVal.of("key", "value");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // Act
        builder.appendKeyVal(kv);
    }

}