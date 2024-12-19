package org.jsoup.helper;

public class GeneratedNewUrlBuilderWithoutQueryIsCreated {

    @Test
    public void newUrlBuilderWithoutQueryIsCreated() {
        URL url = new URL("http://example.com/path");
        UrlBuilder builder = new UrlBuilder(url);
        assertNull(builder.q);
    }

}