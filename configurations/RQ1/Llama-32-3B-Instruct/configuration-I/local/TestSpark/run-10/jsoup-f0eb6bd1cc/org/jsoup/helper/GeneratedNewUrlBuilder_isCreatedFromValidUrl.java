package org.jsoup.helper;

public class GeneratedNewUrlBuilder_isCreatedFromValidUrl {

    @Test
    public void newUrlBuilder_isCreatedFromValidUrl() {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder.u);
        assertNull(builder.q);
    }

}