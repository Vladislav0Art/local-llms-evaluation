package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValWithUTF8EncodingTest {

    @Test
    public void appendKeyValWithUTF8EncodingTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);
        URL outputUrl = urlBuilder.build();
        assertTrue(outputUrl.getQuery().contains("key=value"));
    }

}