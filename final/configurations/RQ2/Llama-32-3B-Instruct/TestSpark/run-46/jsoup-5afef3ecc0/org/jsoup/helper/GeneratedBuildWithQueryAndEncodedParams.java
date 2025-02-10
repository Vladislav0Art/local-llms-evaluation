package org.jsoup.helper;

public class GeneratedBuildWithQueryAndEncodedParams {

    @Test
    public void buildWithQueryAndEncodedParams() throws UnsupportedEncodingException {
        // Arrange
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // Act
        builder.appendKeyVal(Connection.KeyVal.of("key", "value"));
        builder.appendKeyVal(Connection.KeyVal.of("param1", URLEncoder.encode("value1", UTF_8)));

        // Assert
        assertEquals("http://example.com?key=value&param1=value1", StringUtil.toString(builder.build()));
    }

}