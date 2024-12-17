package org.jsoup.helper;

public class GeneratedTestUrlBuilder_noQuery {

    @Test
    public void testUrlBuilder_noQuery() {
        String url = "http://example.com";
        URLBuilder builder = new UrlBuilder(url);
        String normUrl = builder.build().toString();
        assertEquals("http://example.com", normUrl);
    }

}