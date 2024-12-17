package org.jsoup.helper;

public class GeneratedTestAppendUnsupportedEncoding {

    @Test
    public void testAppendUnsupportedEncoding() {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        try {
            urlBuilder.appendKeyVal("key", "value with non-ASCII chars");
            fail("Expected UnsupportedEncodingException to be thrown");
        } catch (UnsupportedEncodingException e) {
            // Expected exception
        }
    }

}