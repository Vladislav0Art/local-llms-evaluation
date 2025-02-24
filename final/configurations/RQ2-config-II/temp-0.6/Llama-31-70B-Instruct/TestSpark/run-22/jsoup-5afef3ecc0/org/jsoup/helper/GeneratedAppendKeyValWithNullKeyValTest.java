package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValWithNullKeyValTest {

    private UrlBuilder builder;

    @Test
    public void appendKeyValWithNullKeyValTest() throws UnsupportedEncodingException {
        URL url = new URL("http://www.example.com/");
        Connection.KeyVal kv = null;
        builder = new UrlBuilder(url);
        builder.appendKeyVal(kv);
    }

}