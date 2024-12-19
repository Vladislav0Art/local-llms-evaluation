package org.jsoup.helper;

public class GeneratedUrlBuilder_appendKeyVal_withNonAsciiValue {

    @Test
    public void urlBuilder_appendKeyVal_withNonAsciiValue() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "äöü");
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);
        assertTrue(builder.q.length() > 0);
    }

}