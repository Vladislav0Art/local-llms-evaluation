package org.jsoup.helper;

public class GeneratedTestAppendKeyValEmptyReferenceOrQueryNoRefOrQuery {

    @Test
    public void testAppendKeyValEmptyReferenceOrQueryNoRefOrQuery() {
        URLBuilder builder = new URLBuilder("https://example.com/path#anchor?query=");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
    }

}