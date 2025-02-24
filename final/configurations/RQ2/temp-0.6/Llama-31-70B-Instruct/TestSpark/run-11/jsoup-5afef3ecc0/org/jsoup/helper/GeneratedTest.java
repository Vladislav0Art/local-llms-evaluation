package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testBuild_WithInvalidUrl_ThrowsMalformedURLException() throws Exception {
        URL inputUrl = new URL("invalid url");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.build();
    }

}