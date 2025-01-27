package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.IDN;
import java.io.UnsupportedEncodingException;

import org.jsoup.Connection.KeyVal;

public class GeneratedAppendKeyVal_testAddingMultipleKeyVal Test {

    @Test
    public void appendKeyVal_testAddingMultipleKeyVal

    Test() throws URISyntaxException, UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "val1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "val2");
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        String url = builder.build().toString();
        assertTrue(url.contains("key1=val1&key2=val2"));
    }

}