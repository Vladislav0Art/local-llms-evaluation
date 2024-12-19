package org.jsoup.helper;

public class GeneratedQueryWithNonAsciiCharsIsEncodedProperly {

    @Test
    public void queryWithNonAsciiCharsIsEncodedProperly() throws UnsupportedEncodingException {
        URL url = new URL("http://example.com/path?non-ascii=a&another=1");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("non-ascii=%61&a=1", builder.q.toString());
    }

}