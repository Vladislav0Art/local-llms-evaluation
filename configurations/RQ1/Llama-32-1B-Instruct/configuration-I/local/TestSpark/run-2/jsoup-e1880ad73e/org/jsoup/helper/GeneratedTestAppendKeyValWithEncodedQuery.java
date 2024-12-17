package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithEncodedQuery {

    @Test
    public void testAppendKeyValWithEncodedQuery() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path?query=value");
        String[] expected = {"key=value", null, "#more"};
        for (String key : expected) {
            assertEquals(key, urlBuilder.appendKeyVal(null).getQuery());
        }
    }

}