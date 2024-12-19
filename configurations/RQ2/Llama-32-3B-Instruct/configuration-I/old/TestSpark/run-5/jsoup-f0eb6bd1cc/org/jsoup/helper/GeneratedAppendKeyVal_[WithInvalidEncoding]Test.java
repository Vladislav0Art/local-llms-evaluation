package org.jsoup.helper;

public class GeneratedAppendKeyVal_[WithInvalidEncoding]

Test {

    @Test
    public void appendKeyVal_[ WithInvalidEncoding]Test() throws UnsupportedEncodingException {
        String inputUrlStr = "http://example.com";
        URL inputUrl = new URL(inputUrlStr);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        try {
            urlBuilder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}