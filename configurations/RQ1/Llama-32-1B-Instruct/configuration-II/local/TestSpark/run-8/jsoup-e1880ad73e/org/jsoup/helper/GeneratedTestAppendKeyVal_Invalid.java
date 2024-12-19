package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_Invalid {

    @Test
    public void testAppendKeyVal_Invalid() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?query=a=1");
        try {
            builder.appendKeyVal(new Connection.KeyVal("key", "value"));
            assert false;
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}