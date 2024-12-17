package org.jsoup.helper;

public class GeneratedAppendKeyValUrlWithQuery {

    @Test
    public void appendKeyValUrlWithQuery() throws UnsupportedEncodingException, MalformedURLException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://test.com?query=param"));
        builder.appendKeyVal(kv);
        assertEquals("http://test.com?key=value&query=param", builder.build().toString());
    }

}