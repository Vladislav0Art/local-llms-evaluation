package org.jsoup.helper;

public class GeneratedTestAppendRef_EmptyValue {

    private static final String URL_PATH = "path/to/test/url";

    @Test
    public void testAppendRef_EmptyValue() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(null); // null key-value pair with ref, empty string as reference
        assertEquals(urlBuilder.u.toString(), "https://example.com/path%2Fto%20test%2Furl");
    }

}