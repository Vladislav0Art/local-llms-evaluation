package org.jsoup.helper;

public class GeneratedNewUrlBuilder_withQuery_isCreatedFromValidUrl {

    @Test
    public void newUrlBuilder_withQuery_isCreatedFromValidUrl() {
        URL inputUrl = new URL("http://example.com?query=abc");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder.u);
        assertNotNull(builder.q);
    }

}