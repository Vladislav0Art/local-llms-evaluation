package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.IDN;
import java.io.UnsupportedEncodingException;

import org.jsoup.Connection.KeyVal;

public class GeneratedAppendKeyVal_testNonStringKeyValue {

    @Test
    public void appendKeyVal_testNonStringKeyValue() throws URISyntaxException, UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("key", 123L);
        try {
            builder.appendKeyVal(kv);
            assert false;
        } catch (UnsupportedEncodingException e) {
            assertEquals("UTF-8 encoding exception", e.getMessage());
        }
    }

}