package org.jsoup.helper;

public class GeneratedTestBuild_WithInvalidUrl_ThrowsMalformedURLException {

    @Test
    public void testBuild_WithInvalidUrl_ThrowsMalformedURLException() throws Exception {
        URL inputUrl = new URL("invalid url");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.build();
    }

}