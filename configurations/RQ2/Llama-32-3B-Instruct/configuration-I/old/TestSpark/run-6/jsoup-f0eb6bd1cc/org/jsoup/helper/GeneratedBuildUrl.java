package org.jsoup.helper;

public class GeneratedBuildUrl {

    @Test
    public void buildUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        assertEquals(new URL("http://example.com"), urlBuilder.build());
    }

}