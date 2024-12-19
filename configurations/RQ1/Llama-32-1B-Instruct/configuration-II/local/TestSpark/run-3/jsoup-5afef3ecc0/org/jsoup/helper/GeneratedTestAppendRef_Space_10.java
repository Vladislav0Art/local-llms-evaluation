package org.jsoup.helper;

public class GeneratedTestAppendRef_Space_10 {

    private static final String URL_PATH = "path/to/test/url";

    @Test
    public void testAppendRef_Space_10() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(new org.jsoup.KeyVal("key", "value ", 10)); // space as key-value pair value, ref
        assertEquals(urlBuilder.u.toString(), "https://example.com/path%2Fto%20test%2Furl?key=value");
    }

}