package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_key_value {

    @Test
    public void testAppendKeyVal_key_value() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(null);
        String key = "key";
        String value = "value";
        builder.appendKeyVal(new Connection.KeyVal(key, value));
        assertEquals("key=value", StringUtil.stripMargin(builder.build().toString()));
    }

}