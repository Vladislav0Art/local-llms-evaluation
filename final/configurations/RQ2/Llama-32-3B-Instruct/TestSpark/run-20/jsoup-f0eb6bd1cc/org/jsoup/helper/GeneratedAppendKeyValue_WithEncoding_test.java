package org.jsoup.helper;

public class GeneratedAppendKeyValue_WithEncoding_test {

    @Test
    public void appendKeyValue_WithEncoding_test() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value with spaces");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(kv);
        String url = StringUtil.toString(builder.build());
        assertTrue(url.contains("?key=value+with+spaces"));
    }

}