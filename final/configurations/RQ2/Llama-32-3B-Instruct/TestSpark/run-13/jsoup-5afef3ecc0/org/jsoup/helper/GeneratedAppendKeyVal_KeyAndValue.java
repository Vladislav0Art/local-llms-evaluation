package org.jsoup.helper;

public class GeneratedAppendKeyVal_KeyAndValue {

    @Test
    public void appendKeyVal_KeyAndValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.setKey(StringUtil.UTF_8);
        kv.setValue(StringUtil.UTF_8);
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        String expectedUrl = "http://example.com?utf8=utf8";
        assertEquals(expectedUrl, builder.build().toString());
    }

}