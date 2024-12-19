package org.jsoup.helper;

public class GeneratedTestAppendKeyValNullUri {

    @Test
    public void testAppendKeyValNullUri() throws UnsupportedEncodingException {
        URLBuilder builder = new URLBuilder(null);
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
        assert assertEquals("", builder.build().getQuery());
    }

}