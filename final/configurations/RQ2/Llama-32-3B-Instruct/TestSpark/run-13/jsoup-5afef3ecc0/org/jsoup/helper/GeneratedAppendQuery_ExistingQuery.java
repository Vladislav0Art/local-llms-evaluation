package org.jsoup.helper;

public class GeneratedAppendQuery_ExistingQuery {

    @Test
    public void appendQuery_ExistingQuery() {
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.setKey(StringUtil.UTF_8);
        kv.setValue(StringUtil.UTF_8);
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com?existing=param"));
        builder.appendKeyVal(kv);
        String expectedUrl = "http://example.com?utf8=utf8&existing=param";
        assertEquals(expectedUrl, builder.build().toString());
    }

}