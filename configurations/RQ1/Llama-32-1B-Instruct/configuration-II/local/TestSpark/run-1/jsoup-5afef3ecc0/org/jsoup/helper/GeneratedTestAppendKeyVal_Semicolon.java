package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_Semicolon {

    @Test
    public void testAppendKeyVal_Semicolon() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        String inputUrl = "http://example.com; foo=bar&baz";
        try {
            urlBuilder.appendKeyVal(new org.jsoup.KeyVal().key("foo", "bar").value(inputUrl));
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

}