package org.jsoup.helper;

public class GeneratedNewUrlBuilder {

    private UrlBuilder urlBuilder;

    @Test
    public void newUrlBuilder() {
        assertNull(urlBuilder);
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

}