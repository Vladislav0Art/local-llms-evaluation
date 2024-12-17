package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_EmptyMap {

    @Test
    public void testAppendKeyVal_EmptyMap() {
        Connection.KeyVal kv = new Connection.KeyVal();
        String encodedKey = URLDecoder.decode(kv.key(), UTF_8.name());
        String encodedValue = URLDecoder.decode(kv.value(), UTF_8.name());
        UrlBuilderTest.appendKeyVal(null);
        assertSame(encodedKey, new StringBuilder().append("=").append(encodedValue).toString());
    }

}