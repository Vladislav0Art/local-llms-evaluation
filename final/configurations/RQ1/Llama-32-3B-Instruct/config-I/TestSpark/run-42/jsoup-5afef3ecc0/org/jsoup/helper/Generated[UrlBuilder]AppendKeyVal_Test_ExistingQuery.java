package org.jsoup.helper;

public class Generated[UrlBuilder]

AppendKeyVal_Test_ExistingQuery {

    @Test
    public void [UrlBuilder]AppendKeyVal_Test_ExistingQuery() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/path?existing=query"));
        urlBuilder.appendKeyVal(kv);
        assertEquals("existing=key=value&query", urlBuilder.u.getQuery());
    }

}