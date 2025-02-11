package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URI;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class GeneratedAppendKeyVal_AppendsKeyValuePair {

    @Test
    public void appendKeyVal_AppendsKeyValuePair() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/path"));
        urlBuilder.appendKeyVal(kv);
        assertEquals("http://example.com/path?key=value", new URL("http://example.com/path").toString());
    }

}