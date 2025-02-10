package org.jsoup.helper;

public class GeneratedAppendFragmentWorks {

    @Test
    public void appendFragmentWorks() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal(null, null);
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertEquals("", StringUtil.length(builder.build().getFragment()));
    }

}