package org.jsoup.helper;

public class GeneratedAppendKeyVal_withValidKeyValueAddsToQuery {

    @Test
    public void appendKeyVal_withValidKeyValueAddsToQuery() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));
        builder.appendKeyVal(kv);
        assertNotNull(builder.q);
        assertEquals(2, builder.q.length());
        assertTrue(builder.q.toString().contains("?key=value"));
    }

}