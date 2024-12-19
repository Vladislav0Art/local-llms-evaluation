package org.jsoup.helper;

public class GeneratedUrlBuilder_appendKeyVal_withQueryAndNonEmptyQuery {

    @Test
    public void urlBuilder_appendKeyVal_withQueryAndNonEmptyQuery() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path/to/resource?query=abc&query2=def"));
        builder.appendKeyVal(kv);
        assertTrue(builder.q.length() > 0);
    }

}