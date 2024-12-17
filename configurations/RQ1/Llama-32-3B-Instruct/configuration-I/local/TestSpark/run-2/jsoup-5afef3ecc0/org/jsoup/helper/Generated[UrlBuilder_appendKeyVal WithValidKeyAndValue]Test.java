package org.jsoup.helper;

public class Generated[
UrlBuilder_appendKeyVal WithValidKeyAndValue]

Test {

    @Test
    public void [UrlBuilder_appendKeyVal WithValidKeyAndValue]Test() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);
        assertNotNull(builder.q);
        assertTrue(builder.q.toString().contains("key=value"));
    }

}