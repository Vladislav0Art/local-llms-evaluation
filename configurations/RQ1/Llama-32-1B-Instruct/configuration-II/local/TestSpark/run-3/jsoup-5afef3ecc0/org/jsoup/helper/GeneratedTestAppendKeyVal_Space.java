package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_Space {

    private static final String URL_PATH = "path/to/test/url";

    @Test
    public void testAppendKeyVal_Space() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(new org.jsoup.KeyVal("key", "value ", 10)); // space as key-value pair value
        assertEquals(urlBuilder.u.toString(), "https://example.com/path%2Fto%20test%2Furl?key=value%2010");
    }

}