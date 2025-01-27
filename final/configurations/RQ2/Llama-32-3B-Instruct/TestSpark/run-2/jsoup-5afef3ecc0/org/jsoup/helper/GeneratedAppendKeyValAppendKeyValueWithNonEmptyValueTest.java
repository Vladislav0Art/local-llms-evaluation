package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.util.DataUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValAppendKeyValueWithNonEmptyValueTest {

    @Test
    public void appendKeyValAppendKeyValueWithNonEmptyValueTest() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("key", "value");
        builder.appendKeyVal(kv);
        assertTrue(builder.build().toString().contains("key=value"));
    }

}