package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendKeyValStringKeyInvalidTest {

    @Test
    public void appendKeyValStringKeyInvalidTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal(null, "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertEquals("key=value", builder.build().toString());
    }

}