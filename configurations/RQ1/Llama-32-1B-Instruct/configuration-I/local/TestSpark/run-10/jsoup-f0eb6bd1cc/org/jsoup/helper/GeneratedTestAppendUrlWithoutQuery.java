package org.jsoup.helper;

public class GeneratedTestAppendUrlWithoutQuery {

    @Test
    public void testAppendUrlWithoutQuery() {
        String url = "http://example.com";
        URLBuilder builder = new UrlBuilder(url);
        String normUrl = builder.build().toString();
        assertEquals("http://example.com", normUrl);
    }

}