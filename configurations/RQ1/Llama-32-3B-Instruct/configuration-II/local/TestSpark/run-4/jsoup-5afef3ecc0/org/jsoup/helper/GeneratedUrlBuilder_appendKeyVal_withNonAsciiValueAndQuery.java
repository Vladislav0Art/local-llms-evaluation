package org.jsoup.helper;

public class GeneratedUrlBuilder_appendKeyVal_withNonAsciiValueAndQuery {

    @Test
    public void urlBuilder_appendKeyVal_withNonAsciiValueAndQuery() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "äöü");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path/to/resource?query=abc"));
        builder.appendKeyVal(kv);
        assertTrue(builder.q.length() > 0);
    }

}