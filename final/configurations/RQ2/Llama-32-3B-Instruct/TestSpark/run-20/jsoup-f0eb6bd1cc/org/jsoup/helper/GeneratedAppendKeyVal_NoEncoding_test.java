package org.jsoup.helper;

public class GeneratedAppendKeyVal_NoEncoding_test {

    @Test
    public void appendKeyVal_NoEncoding_test() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(kv);
        String url = StringUtil.toString(builder.build());
        assertTrue(url.contains("?key=value"));
    }

}