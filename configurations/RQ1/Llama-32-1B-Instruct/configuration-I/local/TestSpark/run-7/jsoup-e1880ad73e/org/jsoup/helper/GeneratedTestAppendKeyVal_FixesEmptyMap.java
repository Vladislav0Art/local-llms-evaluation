package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_FixesEmptyMap {

    @Test
    public void testAppendKeyVal_FixesEmptyMap() {
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.set("key", "value");
        String encodedKey = URLDecoder.decode(kv.key(), UTF_8.name());
        String encodedValue = URLDecoder.decode(kv.value(), UTF_8.name());
        UrlBuilderTest.appendKeyVal(kv);
        assertSame(encodedKey, new StringBuilder().append("=").append(encodedValue).toString());
    }

}