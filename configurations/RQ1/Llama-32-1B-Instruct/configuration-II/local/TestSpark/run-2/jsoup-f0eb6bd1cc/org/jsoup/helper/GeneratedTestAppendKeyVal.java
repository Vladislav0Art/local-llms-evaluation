package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        URLBuilder builder = new URLBuilder("https://example.com/path?a=1&b=2");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
        assert assertEquals("&key1=value1&key2=value2", builder.build().getQuery());
    }

}