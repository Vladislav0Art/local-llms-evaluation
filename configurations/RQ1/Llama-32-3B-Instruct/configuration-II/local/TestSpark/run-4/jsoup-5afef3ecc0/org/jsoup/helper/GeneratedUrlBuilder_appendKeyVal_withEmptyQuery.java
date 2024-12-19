package org.jsoup.helper;

public class GeneratedUrlBuilder_appendKeyVal_withEmptyQuery {

    @Test
    public void urlBuilder_appendKeyVal_withEmptyQuery() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);
        assertTrue(builder.q.length() > 0);
    }

}