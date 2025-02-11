package org.jsoup.helper;

public class GeneratedAppendKeyValAddsMultipleKeyValsToUrlTest {

    @Test
    public void appendKeyValAddsMultipleKeyValsToUrlTest() {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertEquals(0, builder.q.toString().split("&").length - 2);
    }

}