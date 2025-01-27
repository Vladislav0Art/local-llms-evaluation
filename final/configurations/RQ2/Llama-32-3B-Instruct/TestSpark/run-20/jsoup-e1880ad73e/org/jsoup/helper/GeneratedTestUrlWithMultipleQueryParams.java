package org.jsoup.helper;

public class GeneratedTestUrlWithMultipleQueryParams {

    @Test
    public void testUrlWithMultipleQueryParams() {
        String url = "http://example.com?key1=value1&key2=value2&otherParam=otherValue";
        Url expectedUri = new Url(url);
        assertEquals(expectedUri, new UrlBuilder(new URL("http://example.com")).withQuery("key1=value1", "key2=value2", "otherParam=otherValue").build());
    }

}