package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.IDN;
import java.io.UnsupportedEncodingException;

import org.jsoup.Connection.KeyVal;

public class GeneratedAppendKeyVal_testAddingKeyVal Test {

    @Test
    public void appendKeyVal_testAddingKeyVal

    Test() throws URISyntaxException, UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "val");
        builder.appendKeyVal(kv);
        String url = builder.build().toString();
        assertTrue(url.contains("key=val"));
    }

}