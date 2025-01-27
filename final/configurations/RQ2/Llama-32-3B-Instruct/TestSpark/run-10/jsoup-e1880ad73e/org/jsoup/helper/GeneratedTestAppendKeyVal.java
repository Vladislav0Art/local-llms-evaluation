package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    private static final String URL = "http://example.com";

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        UrlBuilder builder = new org.jsoup.helper.UrlBuilder(new URL(URL));
        String kv = "key=value";
        assertEquals(URL + "?key=value", builder.appendKeyVal(kv).toString());
    }

    private java.net.URL connection() {
        return null;
    }
}

public class UrlBuilder {

    public UrlBuilder(java.net.URL url) throws URISyntaxException {
        // implementation
    }

    public String appendKeyVal(String kv) {
        // implementation
    }

    public java.net.URLConnection getURLConnection() {
        // implementation
    }

    public String build() {
        // implementation
    }

}