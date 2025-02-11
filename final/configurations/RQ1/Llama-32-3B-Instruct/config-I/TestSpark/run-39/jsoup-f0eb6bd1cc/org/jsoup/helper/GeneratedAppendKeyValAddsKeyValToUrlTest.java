package org.jsoup.helper;

public class GeneratedAppendKeyValAddsKeyValToUrlTest {

    @Test
    public void appendKeyValAddsKeyValToUrlTest() {
        Connection.KeyVal kv1 = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(kv1);
        assertEquals(0, builder.q.toString().split("&").length - 1);
    }

}