package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.jsoup.Connection;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendKeyVal_key_value {

    @Test
    public void appendKeyVal_key_value() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://localhost:8080"));
        Connection.KeyVal kv = new org.jsoup.helper.Connection.KeyVal();
        kv.key = "key";
        kv.value = "value";
        urlBuilder.appendKeyVal(kv);
        assertEquals("http://localhost:8080?key=value", urlBuilder.build().toString());
    }

}