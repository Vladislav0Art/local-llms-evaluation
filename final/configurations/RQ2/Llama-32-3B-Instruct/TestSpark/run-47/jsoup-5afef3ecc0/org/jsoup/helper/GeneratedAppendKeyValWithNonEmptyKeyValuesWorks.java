package org.jsoup.helper;

public class GeneratedAppendKeyValWithNonEmptyKeyValuesWorks {

    @Test
    public void appendKeyValWithNonEmptyKeyValuesWorks() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertEquals(4, StringUtil.length(kv.getKey()));
        assertEquals(5, StringUtil.length(kv.getValue()));
    }

}