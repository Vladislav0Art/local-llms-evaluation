package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_NullRef {

    private static final String URL_PATH = "path/to/test/url";

    @Test
    public void testAppendKeyVal_NullRef() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        urlBuilder.appendKeyVal(null); // null key-value pair with ref
        assertEquals(urlBuilder.u.toString(), "http://example.com/path/to/test/url");
    }

}