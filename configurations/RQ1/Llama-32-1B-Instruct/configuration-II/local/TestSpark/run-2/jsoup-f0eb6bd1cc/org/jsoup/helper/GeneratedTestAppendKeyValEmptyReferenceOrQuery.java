package org.jsoup.helper;

public class GeneratedTestAppendKeyValEmptyReferenceOrQuery {

    @Test
    public void testAppendKeyValEmptyReferenceOrQuery() {
        URLBuilder builder = new URLBuilder("https://example.com/path?query=");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
    }

}