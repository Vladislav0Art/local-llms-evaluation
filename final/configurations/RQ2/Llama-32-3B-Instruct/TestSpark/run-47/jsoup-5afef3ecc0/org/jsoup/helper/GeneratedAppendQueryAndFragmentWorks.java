package org.jsoup.helper;

public class GeneratedAppendQueryAndFragmentWorks {

    @Test
    public void appendQueryAndFragmentWorks() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal(null, null);
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertEquals(0, StringUtil.length(builder.build().getQuery()));
        assertEquals("", StringUtil.length(builder.build().getFragment()));
    }

}