package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendKeyValInvalidEncodingTest {

    @Test
    public void appendKeyValInvalidEncodingTest() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value\u0000");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        try {
            builder.appendKeyVal(kv);
            fail();
        } catch (UnsupportedEncodingException e) {
        }
    }

}