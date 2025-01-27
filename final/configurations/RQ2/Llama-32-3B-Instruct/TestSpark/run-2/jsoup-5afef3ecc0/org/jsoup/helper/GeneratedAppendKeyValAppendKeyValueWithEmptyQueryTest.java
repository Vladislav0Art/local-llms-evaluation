package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.util.DataUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValAppendKeyValueWithEmptyQueryTest {

    @Test
    public void appendKeyValAppendKeyValueWithEmptyQueryTest() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        String query = "key=value";
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("", query);
        builder.appendKeyVal(kv);
        assertTrue(builder.build().toString().contains("?key="));
    }

}