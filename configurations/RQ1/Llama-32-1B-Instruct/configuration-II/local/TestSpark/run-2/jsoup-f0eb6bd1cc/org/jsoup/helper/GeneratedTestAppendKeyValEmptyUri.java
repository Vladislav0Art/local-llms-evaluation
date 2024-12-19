package org.jsoup.helper;

public class GeneratedTestAppendKeyValEmptyUri {

    @Test
    public void testAppendKeyValEmptyUri() throws UnsupportedEncodingException {
        URLBuilder builder = new URLBuilder("");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
        assert assertEquals("", builder.build().getQuery());
    }

}