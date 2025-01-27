package org.jsoup.helper;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() {
        String url = "https://example.com";
        UrlBuilder builder = new UrlBuilder(url);

        assertEquals("https://example.com", builder.getBuild());
    }

}