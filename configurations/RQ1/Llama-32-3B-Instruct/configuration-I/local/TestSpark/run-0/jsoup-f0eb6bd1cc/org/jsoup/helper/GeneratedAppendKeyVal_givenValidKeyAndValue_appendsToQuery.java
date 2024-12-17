package org.jsoup.helper;

public class GeneratedAppendKeyVal_givenValidKeyAndValue_appendsToQuery {

    @Test
    public void appendKeyVal_givenValidKeyAndValue_appendsToQuery() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        builder.appendKeyVal(kv);
        assertEquals("?key=value", builder.q.toString());
    }

}