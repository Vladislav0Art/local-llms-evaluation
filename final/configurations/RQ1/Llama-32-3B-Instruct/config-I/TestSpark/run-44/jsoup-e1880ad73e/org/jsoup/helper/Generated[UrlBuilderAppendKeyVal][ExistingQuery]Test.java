package org.jsoup.helper;

public class Generated[UrlBuilderAppendKeyVal][ExistingQuery]

Test {

    @Test
    public void [UrlBuilderAppendKeyVal][ExistingQuery]Test() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        URL url = new URL("http://example.com/path?existing=query");
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(kv);
        assertNotNull(builder.u);
        assertEquals("?key=value&existing=query", builder.q.toString());
    }

}