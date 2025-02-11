package org.jsoup.helper;

public class Generated[UrlBuilder_appendKeyVal]

Test {

    @Test
    public void [UrlBuilder_appendKeyVal]Test() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder ub = new UrlBuilder(new URL("http://example.com"));
        ub.appendKeyVal(kv);
        assertNotNull(ub.q);
        assertEquals(2, ub.q.length());
    }

}