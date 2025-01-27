package org.jsoup.helper;

public class GeneratedBuildInvalidUrl {

    @Test
    public void buildInvalidUrl() {
        assertThrows(MalformedURLException.class, () -> new UrlBuilder(new URL("invalid://example.com")));
    }

}