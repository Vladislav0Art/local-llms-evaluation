package org.jsoup.helper;

public class Generated[UrlBuilderAppendKeyVal][NoExistingQuery]

Test {

    @Test
    public void [UrlBuilderAppendKeyVal][NoExistingQuery]Test() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        URL url = new URL("http://example.com/path");
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(kv);
        assertNotNull(builder.u);
        assertEquals("?key=value", builder.q.toString());
    }

}