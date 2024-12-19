package org.jsoup.helper;

public class GeneratedTestAppendKeyValNoReferenceOrQuery {

    @Test
    public void testAppendKeyValNoReferenceOrQuery() {
        URLBuilder builder = new URLBuilder("https://example.com/path#anchor");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
    }

}