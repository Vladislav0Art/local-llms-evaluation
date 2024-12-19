package org.jsoup.helper;

public class GeneratedTestAppendKeyValEmptyFragment {

    @Test
    public void testAppendKeyValEmptyFragment() throws UnsupportedEncodingException {
        URLBuilder builder = new URLBuilder("https://example.com/path?query=a=1&b=2");
        String[] keyValues = {"key1", "key2"};
        for (String kv : keyValues) {
            builder.appendKeyVal(kv);
        }
    }

}