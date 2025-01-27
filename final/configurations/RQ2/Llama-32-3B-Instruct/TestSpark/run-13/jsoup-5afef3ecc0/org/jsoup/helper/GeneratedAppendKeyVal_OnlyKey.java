package org.jsoup.helper;

public class GeneratedAppendKeyVal_OnlyKey {

    @Test
    public void appendKeyVal_OnlyKey() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.setValue(StringUtil.UTF_8);
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertThrows(UnsupportedEncodingException.class, () -> builder.build());
    }

}