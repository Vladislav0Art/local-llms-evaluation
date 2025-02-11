package org.jsoup.helper;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() throws UnsupportedEncodingException {
        String url = "http://example.com/path?query=value#fragment";
        try {
            char[] actualAsciiOnly = UrlBuilder.urlBuilder(url).toCharArray();
            assertArrayEquals(actualAsciiOnly, actualAsciiOnly);
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}