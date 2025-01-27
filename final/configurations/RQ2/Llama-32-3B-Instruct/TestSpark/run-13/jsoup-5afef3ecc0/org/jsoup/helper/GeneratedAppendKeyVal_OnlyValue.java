package org.jsoup.helper;

public class GeneratedAppendKeyVal_OnlyValue {

    @Test
    public void appendKeyVal_OnlyValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.setKey(StringUtil.UTF_8);
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertThrows(UnsupportedEncodingException.class, () -> builder.build());
    }

}