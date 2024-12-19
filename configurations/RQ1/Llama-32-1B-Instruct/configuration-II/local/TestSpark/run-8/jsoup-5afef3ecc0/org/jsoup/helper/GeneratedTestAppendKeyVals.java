package org.jsoup.helper;

public class GeneratedTestAppendKeyVals {

    @Test
    public void testAppendKeyVals() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new URLBuilder(new URL("https://example.com/path"));
        String[] kvPairs = {"key1", "value1", "key2", "value2"};
        for (String kv : kvPairs) {
            urlBuilder.appendKeyVal(Connection.KeyVal.of(kv));
        }
        assertSame(urlBuilder.u, new URL("https://example.com/path?key1=value1&key2=value2"));
    }

}