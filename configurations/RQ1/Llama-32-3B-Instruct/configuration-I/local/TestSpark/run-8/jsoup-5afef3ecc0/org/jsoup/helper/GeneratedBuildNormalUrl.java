package org.jsoup.helper;

public class GeneratedBuildNormalUrl {

    @Test
    public void buildNormalUrl() {
        URL inputUrl = new URL("http://test.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, builder.build());
    }

}