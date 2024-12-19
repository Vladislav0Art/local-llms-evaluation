package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_NonAscii {

    @Test
    public void testAppendKeyVal_NonAscii() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        String inputUrl = "http://example.com; foo=bar";
        try {
            urlBuilder.appendKeyVal(new org.jsoup.KeyVal().key("foo", "bar").value(inputUrl));
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

}