package org.jsoup.helper;

public class GeneratedUrlBuilder_appendKeyVal_NoKeyValue {

    @Test
    public void urlBuilder_appendKeyVal_NoKeyValue() {
        //given
        String key = "key";
        Connection.KeyVal kv = null;
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));

        //when
        try {
            builder.appendKeyVal(kv);
            assert false : "Expected UnsupportedEncodingException";
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}