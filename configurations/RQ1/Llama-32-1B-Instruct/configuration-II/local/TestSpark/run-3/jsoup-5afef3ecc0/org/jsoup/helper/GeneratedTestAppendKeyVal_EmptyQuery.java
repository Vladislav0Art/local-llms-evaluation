package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_EmptyQuery {

    private static final String URL_PATH = "path/to/test/url";

    @Test
    public void testAppendKeyVal_EmptyQuery() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(null); // no key-value pair
        assertEquals(urlBuilder.u.toString(), "http://example.com/path%2Fto%20test%2Furl");
    }

}