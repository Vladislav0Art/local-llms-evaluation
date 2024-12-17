package org.jsoup.helper;

public class GeneratedTestUrlBuilder_emptyQuery {

    @Test
    public void testUrlBuilder_emptyQuery() {
        String url = "http://example.com?test=1&key=value#anchor";
        URLBuilder builder = new UrlBuilder(url);
        String normUrl = builder.build().toString();
        assertEquals("http://example.com", normUrl);
    }

}