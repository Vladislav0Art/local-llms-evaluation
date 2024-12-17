package org.jsoup.helper;

public class GeneratedAppendKeyValTest_WithInvalidKeyValPairs_throwsException {

    @Test
    public void appendKeyValTest_WithInvalidKeyValPairs_throwsException() {
        Connection.KeyVal invalidKv = new Connection.KeyVal("invalid key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        try {
            urlBuilder.appendKeyVal(invalidKv);
            fail("Expected exception not thrown");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}