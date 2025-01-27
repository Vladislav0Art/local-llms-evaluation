package org.jsoup.helper;

public class GeneratedTestUrlWithQueryParams {

    @Test
    public void testUrlWithQueryParams() {
        String url = "http://example.com?key1=value1&key2=value2";
        Url expectedUri = new Url(url);
        assertEquals(expectedUri, new UrlBuilder(new URL("http://example.com")).withQuery("key1=value1&key2=value2").build());
    }

}