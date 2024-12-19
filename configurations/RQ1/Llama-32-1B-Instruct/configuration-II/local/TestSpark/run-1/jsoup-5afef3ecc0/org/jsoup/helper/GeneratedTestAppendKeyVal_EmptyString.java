package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_EmptyString {

    @Test
    public void testAppendKeyVal_EmptyString() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        String inputUrl = "";
        try {
            urlBuilder.appendKeyVal(new org.jsoup.KeyVal().key("foo", "bar").value(inputUrl));
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

}