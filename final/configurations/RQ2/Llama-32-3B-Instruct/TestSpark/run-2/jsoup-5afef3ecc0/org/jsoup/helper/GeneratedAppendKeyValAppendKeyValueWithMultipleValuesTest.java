package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.util.DataUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValAppendKeyValueWithMultipleValuesTest {

    @Test
    public void appendKeyValAppendKeyValueWithMultipleValuesTest() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        String query = "key1=value1&key2=value2";
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("", query);
        builder.appendKeyVal(kv);
        assertTrue(builder.build().toString().contains("?key1="));
    }

}