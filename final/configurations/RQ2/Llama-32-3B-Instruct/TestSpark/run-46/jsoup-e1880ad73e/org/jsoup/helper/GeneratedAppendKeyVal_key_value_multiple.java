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

public class GeneratedAppendKeyVal_key_value_multiple {

    @Test
    public void appendKeyVal_key_value_multiple() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://localhost:8080"));
        Connection.KeyVal kv1 = new org.jsoup.helper.Connection.KeyVal();
        kv1.key = "key1";
        kv1.value = "value1";
        Connection.KeyVal kv2 = new org.jsoup.helper.Connection.KeyVal();
        kv2.key = "key2";
        kv2.value = "value2";
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);
        assertEquals("http://localhost:8080?key1=value1&key2=value2", urlBuilder.build().toString());
    }

}