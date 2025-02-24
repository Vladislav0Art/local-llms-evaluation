package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValWithInvalidEncodingTest {

    @Test
    public void appendKeyValWithInvalidEncodingTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);
        URL outputUrl = urlBuilder.build();
        assertTrue(outputUrl.getQuery().contains("key=value"));
    }

}