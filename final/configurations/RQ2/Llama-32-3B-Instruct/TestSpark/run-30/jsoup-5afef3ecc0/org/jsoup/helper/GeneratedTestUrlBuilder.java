package org.jsoup.helper;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() {
        UrlBuilder builder = new UrlBuilder();
        String url = "https://example.com";
        builder.addQuery("key", "value");
        assertNotNull(builder.build(url));
    }

}