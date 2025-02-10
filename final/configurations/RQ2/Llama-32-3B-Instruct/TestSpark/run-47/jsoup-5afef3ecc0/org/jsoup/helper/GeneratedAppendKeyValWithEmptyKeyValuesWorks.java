package org.jsoup.helper;

public class GeneratedAppendKeyValWithEmptyKeyValuesWorks {

    @Test
    public void appendKeyValWithEmptyKeyValuesWorks() {
        Connection.KeyVal kv = new Connection.KeyVal();
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertEquals(0, StringUtil.length(kv.getKey()));
        assertEquals(0, StringUtil.length(kv.getValue()));
    }

}