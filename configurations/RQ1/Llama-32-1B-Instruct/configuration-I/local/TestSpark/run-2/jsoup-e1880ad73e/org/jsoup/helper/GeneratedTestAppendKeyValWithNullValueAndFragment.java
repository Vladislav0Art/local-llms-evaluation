package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithNullValueAndFragment {

    @Test
    public void testAppendKeyValWithNullValueAndFragment() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path#fragment?key=value");
        String[] expected = {"key", "value"};
        for (String key : expected) {
            assertEquals(key, urlBuilder.appendKeyVal(null).getFragment());
        }
    }

}