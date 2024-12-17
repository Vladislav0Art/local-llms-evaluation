package org.jsoup.helper;

public class GeneratedAppendKeyVal_[NoKeyVal]

Test {

    @Test
    public void appendKeyVal_[ NoKeyVal]Test() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        Connection.KeyVal kv = null;
        try {
            urlBuilder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}