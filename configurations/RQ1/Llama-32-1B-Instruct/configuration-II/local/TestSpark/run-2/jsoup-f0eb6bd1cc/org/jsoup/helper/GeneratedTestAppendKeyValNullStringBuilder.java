package org.jsoup.helper;

public class GeneratedTestAppendKeyValNullStringBuilder {

    @Test
    public void testAppendKeyValNullStringBuilder() throws UnsupportedEncodingException {
        URLBuilder builder = new URLBuilder("https://example.com/path?a=1&b=2");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            assert ThrowsNullPointerException.class.isAssignableFrom(builder.appendKeyVal(kv).getClass());
        }
    }

}