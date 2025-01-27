package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValWithNonEncodedValue {

    @Test
    public void appendKeyValWithNonEncodedValue() throws UnsupportedEncodingException, URISyntaxException {
        String nonEncodedValue = "value";
        Connection.KeyVal kv = Connection.KeyVal.valueOf("key", nonEncodedValue);
        new UrlBuilder(new URL("http://example.com")).appendKeyVal(kv).build().toString();
    }

}