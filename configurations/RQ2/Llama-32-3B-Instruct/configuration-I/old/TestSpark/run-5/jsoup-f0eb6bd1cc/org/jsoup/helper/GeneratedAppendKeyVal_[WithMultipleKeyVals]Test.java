package org.jsoup.helper;

public class GeneratedAppendKeyVal_[WithMultipleKeyVals]

Test {

    @Test
    public void appendKeyVal_[ WithMultipleKeyVals]Test() throws UnsupportedEncodingException {
        String inputUrlStr = "http://example.com";
        URL inputUrl = new URL(inputUrlStr);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        try {
            urlBuilder.appendKeyVal(kv1);
            urlBuilder.appendKeyVal(kv2);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}