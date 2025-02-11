package org.jsoup.helper;

public class Generated[UrlBuilder]

AppendKeyVal_Test {

    @Test
    public void [UrlBuilder]AppendKeyVal_Test() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/path"));
        urlBuilder.appendKeyVal(kv);
        assertEquals("key=value", urlBuilder.u.getQuery());
    }

}