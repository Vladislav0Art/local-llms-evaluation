package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_NonAsciiEscapesWithExistingEscapes {

    @Test
    public void testAppendKeyVal_NonAsciiEscapesWithExistingEscapes() {
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.set("key", "non-ascii value with existing escape");
        String encodedKey = URLDecoder.decode(kv.key(), UTF_8.name());
        String encodedValue = URLDecoder.decode(kv.value(), UTF_8.name());
        UrlBuilderTest.appendKeyVal(kv);
        assertSame(encodedKey, new StringBuilder().append("=").append(encodedValue).toString());
    }

}