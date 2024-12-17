package org.jsoup.helper;

public class GeneratedTestAppendKeyValNullRef {

    @Test
    public void testAppendKeyValNullRef() {
        UrlBuilder url = new UrlBuilder("https://example.com/path");
        try {
            url.appendKeyVal(null);
            fail("Expected MalformedURLException");
        } catch (MalformedURLException e) {
            // expected
        }
    }

}