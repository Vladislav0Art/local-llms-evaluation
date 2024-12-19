package org.jsoup.helper;

public class GeneratedTestAppendKeyValEmptyPath {

    @Test
    public void testAppendKeyValEmptyPath() throws UnsupportedEncodingException {
        URLBuilder builder = new URLBuilder("https://example.com/path");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
        assert assertEquals("", builder.build().getPath());
    }

}