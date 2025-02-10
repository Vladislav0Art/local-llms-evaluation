package org.jsoup.helper;

public class GeneratedBuildWithEncodedParams {

    @Test
    public void buildWithEncodedParams() throws UnsupportedEncodingException {
        // Arrange
        URL inputUrl = new URL("http://example.com?param1=value1&param2=value2");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // Act
        URL url = builder.build();

        // Assert
        assertEquals("http://example.com?param1=value1%26param2=value2", StringUtil.toString(url));
    }

}