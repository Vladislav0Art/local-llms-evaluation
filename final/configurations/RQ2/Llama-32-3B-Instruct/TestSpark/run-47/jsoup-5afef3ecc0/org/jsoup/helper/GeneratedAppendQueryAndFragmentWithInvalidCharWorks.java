package org.jsoup.helper;

public class GeneratedAppendQueryAndFragmentWithInvalidCharWorks {

    @Test
    public void appendQueryAndFragmentWithInvalidCharWorks() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal(null, "value with !");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertEquals(0, StringUtil.length(builder.build().getQuery()));
    }

}