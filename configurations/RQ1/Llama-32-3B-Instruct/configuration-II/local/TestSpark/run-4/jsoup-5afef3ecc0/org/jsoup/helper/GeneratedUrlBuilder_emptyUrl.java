package org.jsoup.helper;

public class GeneratedUrlBuilder_emptyUrl {

    @Test
    public void urlBuilder_emptyUrl() {
        UrlBuilder builder = new UrlBuilder(null);
        assertNull(builder.u);
        assertTrue(builder.q == null || builder.q.length() == 0);
    }

}