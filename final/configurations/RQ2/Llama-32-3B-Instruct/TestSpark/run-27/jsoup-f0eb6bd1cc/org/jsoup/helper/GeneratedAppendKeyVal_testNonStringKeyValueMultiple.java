package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.IDN;
import java.io.UnsupportedEncodingException;

import org.jsoup.Connection.KeyVal;

public class GeneratedAppendKeyVal_testNonStringKeyValueMultiple {

    @Test
    public void appendKeyVal_testNonStringKeyValueMultiple() throws URISyntaxException, UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", 123L);
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", 456L);
        try {
            builder.appendKeyVal(kv1);
            builder.appendKeyVal(kv2);
            assert false;
        } catch (UnsupportedEncodingException e) {
            assertEquals("UTF-8 encoding exception", e.getMessage());
        }
    }

}