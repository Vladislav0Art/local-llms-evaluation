package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new URLBuilder(new URL("https://example.com/path"));
        urlBuilder.appendKeyVal(Connection.KeyVal.of("key", "value"));
        assertSame(urlBuilder.u, new URL("https://example.com/path?key=value"));
    }

}