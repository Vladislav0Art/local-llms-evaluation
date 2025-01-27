package org.jsoup.helper;

public class GeneratedUrlBuilder_appendKeyVal_NoKeyOrValue {

    @Test
    public void urlBuilder_appendKeyVal_NoKeyOrValue() {
        //given
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