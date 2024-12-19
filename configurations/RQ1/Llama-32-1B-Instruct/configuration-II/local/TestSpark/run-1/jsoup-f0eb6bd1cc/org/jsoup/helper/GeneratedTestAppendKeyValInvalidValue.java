package org.jsoup.helper;

public class GeneratedTestAppendKeyValInvalidValue {

    @Test
    public void testAppendKeyValInvalidValue() {
        URLBuilder builder = new URLBuilder(new URI("https://example.com/path#query"));
        try {
            builder.appendKeyVal(KeyVal.of("key", "value"), KeyVal.of("key", null));
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

}