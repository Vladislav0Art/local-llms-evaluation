package org.jsoup.helper;

public class GeneratedBuildWithQuery {

    @Test
    public void buildWithQuery() throws UnsupportedEncodingException {
        // Arrange
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // Act
        builder.appendKeyVal(Connection.KeyVal.of("key", "value"));

        // Assert
        assertEquals("http://example.com?key=value", StringUtil.toString(builder.build()));
    }

}