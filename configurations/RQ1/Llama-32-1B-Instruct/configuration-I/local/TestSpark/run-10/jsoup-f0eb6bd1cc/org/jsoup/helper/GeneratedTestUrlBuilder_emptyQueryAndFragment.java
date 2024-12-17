package org.jsoup.helper;

public class GeneratedTestUrlBuilder_emptyQueryAndFragment {

    @Test
    public void testUrlBuilder_emptyQueryAndFragment() {
        String url = "http://example.com?test=1&key=value#anchor";
        URLBuilder builder = new UrlBuilder(url);
        String normUrl = builder.build().toString();
        assertEquals("http://example.com", normUrl);
    }

}