package org.jsoup.helper;

public class GeneratedTestUrlBuilderWithEncoding {

    @Test
    public void testUrlBuilderWithEncoding() {
        String url = "https://example.com";
        UrlBuilder builder = new UrlBuilder(url);

        assertEquals("https://example.com", builder.getBuild());

        // Test with encoding
        assertEquals("https://example.com?key=ä=value", builder.addQueryParameter("key", "value").getBuild());
    }

}