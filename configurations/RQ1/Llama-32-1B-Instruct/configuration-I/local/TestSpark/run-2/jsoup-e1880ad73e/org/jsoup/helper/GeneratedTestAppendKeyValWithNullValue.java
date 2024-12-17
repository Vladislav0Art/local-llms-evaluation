package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithNullValue {

    @Test
    public void testAppendKeyValWithNullValue() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path?key=value");
        String[] expected = {"key", "value"};
        for (String key : expected) {
            assertEquals(key, urlBuilder.appendKeyVal(null).getQuery());
        }
    }

}