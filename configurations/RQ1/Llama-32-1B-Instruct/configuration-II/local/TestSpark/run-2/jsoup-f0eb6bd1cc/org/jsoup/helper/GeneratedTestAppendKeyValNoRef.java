package org.jsoup.helper;

public class GeneratedTestAppendKeyValNoRef {

    @Test
    public void testAppendKeyValNoRef() {
        URLBuilder builder = new URLBuilder("https://example.com/path?a=1&b=2#anchor");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
        assert assertEquals("&a=1&b=2#anchor", builder.build().getFragment());
    }

}