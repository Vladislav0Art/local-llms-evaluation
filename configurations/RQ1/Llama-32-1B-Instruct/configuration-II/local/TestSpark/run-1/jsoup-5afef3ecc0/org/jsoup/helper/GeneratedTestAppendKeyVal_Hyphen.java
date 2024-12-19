package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_Hyphen {

    @Test
    public void testAppendKeyVal_Hyphen() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        String inputUrl = "http://example.com; foo=-1&baz";
        try {
            urlBuilder.appendKeyVal(new org.jsoup.KeyVal().key("foo", "-1").value(inputUrl));
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

}