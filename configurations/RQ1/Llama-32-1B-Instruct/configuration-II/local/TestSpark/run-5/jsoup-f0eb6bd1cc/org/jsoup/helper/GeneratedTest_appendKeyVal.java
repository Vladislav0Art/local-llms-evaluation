package org.jsoup.helper;

public class GeneratedTest_appendKeyVal {

    private static final String BASE_URL = "https://example.com/path?a=1&b=2#fragment";

    @Test
    public void test_appendKeyVal() throws UnsupportedEncodingException {
        URL baseUrl = new URI("https://example.com/path?a=1&b=2");
        String expectedAppend = "a%3D1&a%3D2";
        UrlBuilder urlBuilder = new UrlBuilder(baseUrl);
        urlBuilder.appendKeyVal(new KeyVal("c", "3"));
        String actualAppend = urlBuilder.q.toString();
        assertEquals(expectedAppend, actualAppend);
    }

}