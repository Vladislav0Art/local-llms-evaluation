package org.jsoup.helper;

public class Generated[UrlBuilderAppendKeyVal][SingleKeyValuePairs]

Test {

    @Test
    public void [UrlBuilderAppendKeyVal][SingleKeyValuePairs]Test() {
        Connection.KeyVal kv1 = new Connection.KeyVal("key", "value");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        URL url = new URL("http://example.com/path");
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertNotNull(builder.u);
        assertEquals("key=value&key2=value2", builder.q.toString());
    }

}