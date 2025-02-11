package org.jsoup.helper;

public class GeneratedTestUrlBuilder2 {

    @Test
    public void testUrlBuilder2() throws UnsupportedEncodingException {
        String url = "http://example.com/path?query=value#fragment";
        char[] expectedAsciiOnly = {'h', 't', 't', 'p', '://', 'e', 'x', 'a', 'm', 'p', 'l', 'e', '.', 'c', 'o', 'm', '/', 'p', 'a', 't', 'h', '?', 'q', 'u', 'e', 'r', 'y', '=', 'v', 'a', 'l', 'u', 'e', '#', 'f', 'r', 'a', 'g', 's', 'm', 'e', 'n', 't'};
        char[] actualAsciiOnly = UrlBuilder.urlBuilder(url).toCharArray();
        assertArrayEquals(expectedAsciiOnly, actualAsciiOnly);
    }

}