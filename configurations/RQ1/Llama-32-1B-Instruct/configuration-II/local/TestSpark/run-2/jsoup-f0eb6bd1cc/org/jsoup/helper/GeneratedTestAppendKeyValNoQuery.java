package org.jsoup.helper;

public class GeneratedTestAppendKeyValNoQuery {

    @Test
    public void testAppendKeyValNoQuery() {
        URLBuilder builder = new URLBuilder("https://example.com/path?query=a=1&b=2");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
    }

}