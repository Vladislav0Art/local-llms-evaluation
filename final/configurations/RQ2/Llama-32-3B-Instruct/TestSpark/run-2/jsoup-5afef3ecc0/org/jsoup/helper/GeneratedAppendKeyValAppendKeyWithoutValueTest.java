package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.util.DataUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValAppendKeyWithoutValueTest {

    @Test
    public void appendKeyValAppendKeyWithoutValueTest() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("key", null);
        builder.appendKeyVal(kv);
        assertFalse(builder.build().toString().isEmpty());
    }

}