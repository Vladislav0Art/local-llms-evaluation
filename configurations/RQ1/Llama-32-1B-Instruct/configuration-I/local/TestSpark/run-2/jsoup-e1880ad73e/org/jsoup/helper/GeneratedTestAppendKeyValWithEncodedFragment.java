package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithEncodedFragment {

    @Test
    public void testAppendKeyValWithEncodedFragment() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path#fragment");
        String[] expected = {"key=value", null};
        for (String key : expected) {
            assertEquals(key, urlBuilder.appendKeyVal(null).getFragment());
        }
    }

}