package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_NullValue {

    private static final String URL_PATH = "path/to/test/url";

    @Test
    public void testAppendKeyVal_NullValue() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(null); // null value as key-value pair
        assertEquals(urlBuilder.u.toString(), "https://example.com/path%2Fto%20test%2Furl");
    }

}