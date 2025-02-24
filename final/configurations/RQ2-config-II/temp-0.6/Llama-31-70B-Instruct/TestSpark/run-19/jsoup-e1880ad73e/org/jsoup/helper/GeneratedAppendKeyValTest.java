package org.jsoup.helper;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "val", true);
        urlBuilder.appendKeyVal(kv);
        assertEquals("http://example.com?key=val", urlBuilder.build().toString());
    }

}