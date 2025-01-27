package org.jsoup.helper;

public class GeneratedAppendKeyVal_NoKeyOrValue {

    @Test
    public void appendKeyVal_NoKeyOrValue() {
        Connection.KeyVal kv = new Connection.KeyVal();
        try {
            UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
            builder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}