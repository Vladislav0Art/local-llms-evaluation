package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithEncodedQueryAndFragment {

    @Test
    public void testAppendKeyValWithEncodedQueryAndFragment() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path?query=value#fragment");
        String[] expected = {"key=value", null, "#more"};
        for (String key : expected) {
            assertEquals(key, urlBuilder.appendKeyVal(null).getQuery());
        }
    }

}