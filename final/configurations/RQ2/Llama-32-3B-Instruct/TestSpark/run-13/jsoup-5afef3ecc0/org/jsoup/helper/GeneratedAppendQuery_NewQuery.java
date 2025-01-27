package org.jsoup.helper;

public class GeneratedAppendQuery_NewQuery {

    @Test
    public void appendQuery_NewQuery() {
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.setKey(StringUtil.UTF_8);
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        String expectedUrl = "http://example.com?utf8=utf8";
        assertEquals(expectedUrl, builder.build().toString());
    }

}