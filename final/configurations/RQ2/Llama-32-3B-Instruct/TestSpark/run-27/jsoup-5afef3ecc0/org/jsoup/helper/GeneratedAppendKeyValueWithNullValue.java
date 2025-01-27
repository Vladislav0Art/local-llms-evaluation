package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendKeyValueWithNullValue {

    @Test
    public void appendKeyValueWithNullValue() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        String result = builder.appendKeyVal(kv).toString();
        assertEquals("http://example.com?key=value", result);
    }

}