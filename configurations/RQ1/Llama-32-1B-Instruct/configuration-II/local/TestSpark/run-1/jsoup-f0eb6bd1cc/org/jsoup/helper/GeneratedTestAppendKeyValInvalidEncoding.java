package org.jsoup.helper;

public class GeneratedTestAppendKeyValInvalidEncoding {

    @Test
    public void testAppendKeyValInvalidEncoding() {
        URLBuilder builder = new URLBuilder(new URI("https://example.com/path#query"));
        try {
            builder.appendKeyVal(KeyVal.of("key", "value"), new UnsupportedEncodingException());
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

}