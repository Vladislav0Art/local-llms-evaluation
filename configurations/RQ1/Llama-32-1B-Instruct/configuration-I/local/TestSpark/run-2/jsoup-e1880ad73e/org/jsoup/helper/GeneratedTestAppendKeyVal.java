package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com/path?key=value&more=here");
        String[] expected = {"key", "value", null, "#more"};
        for (String key : expected) {
            assertEquals(key, urlBuilder.appendKeyVal(null).getQuery());
        }
    }

}