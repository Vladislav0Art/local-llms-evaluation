package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValWithValidKeyValTest {

    private UrlBuilder builder;

    @Test
    public void appendKeyValWithValidKeyValTest() throws UnsupportedEncodingException {
        URL url = new URL("http://www.example.com/");
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        builder = new UrlBuilder(url);
        builder.appendKeyVal(kv);
    }

}