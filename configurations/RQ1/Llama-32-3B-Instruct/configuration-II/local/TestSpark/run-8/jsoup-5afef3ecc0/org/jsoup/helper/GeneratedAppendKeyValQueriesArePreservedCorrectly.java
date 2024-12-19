package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.util.HashMap;

public class GeneratedAppendKeyValQueriesArePreservedCorrectly {

    @Test
    public void appendKeyValQueriesArePreservedCorrectly() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com?query=123");
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(kv);
        assertEquals("?query=123&key=value", builder.q.toString());
    }

}