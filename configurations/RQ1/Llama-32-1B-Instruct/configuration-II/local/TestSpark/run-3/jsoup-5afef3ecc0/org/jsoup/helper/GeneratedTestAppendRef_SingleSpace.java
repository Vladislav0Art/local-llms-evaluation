package org.jsoup.helper;

public class GeneratedTestAppendRef_SingleSpace {

    private static final String URL_PATH = "path/to/test/url";

    @Test
    public void testAppendRef_SingleSpace() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(null); // null key-value pair with ref, single space as reference
        assertEquals(urlBuilder.u.toString(), "https://example.com/path%2Fto%20test%2Furl?key=value ");
    }

}