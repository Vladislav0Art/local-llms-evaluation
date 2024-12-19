package org.jsoup.helper;

public class GeneratedNewUrlBuilderWithExistingQueryIsCreated {

    @Test
    public void newUrlBuilderWithExistingQueryIsCreated() {
        URL url = new URL("http://example.com/path?a=1&b=2");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(3, url.getQuery().split("&").length);
    }

}