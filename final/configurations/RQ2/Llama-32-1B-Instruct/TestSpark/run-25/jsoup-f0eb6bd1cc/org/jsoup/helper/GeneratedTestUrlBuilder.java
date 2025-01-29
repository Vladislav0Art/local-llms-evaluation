package org.jsoup.helper;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() {
        String inputUrl = "http://example.com";
        Url url = new UrlBuilder(inputUrl).build();
        assertEquals("http://example.com", url.toString());
    }

}