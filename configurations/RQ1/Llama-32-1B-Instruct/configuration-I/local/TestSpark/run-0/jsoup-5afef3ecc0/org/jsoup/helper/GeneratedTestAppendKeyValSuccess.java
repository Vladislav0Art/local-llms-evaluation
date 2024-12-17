package org.jsoup.helper;

public class GeneratedTestAppendKeyValSuccess {

    private UrlBuilder urlBuilder;

    @Test
    public void testAppendKeyValSuccess() throws UnsupportedEncodingException {
        String[] kv = {("key", "value"),("another_key", "another_value")};
        urlBuilder.appendKeyVal(kv);
        assertEquals("https://example.com/path?key=value&another_key=another_value", url.getScheme() + "://" + url.getHost());
    }

}