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

import org.mockito.Mockito;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

public class GeneratedAppendKeyValUrl {

    @Test
    public void appendKeyValUrl() throws UnsupportedEncodingException, MalformedURLException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        String url = new Mockito.Object() {
            public String of(String key, String value) {
                return "http://other.example.com?" + value;
            }
        }.of("key", "value");
        String result = builder.appendKeyVal(new Mockito.Object() {
            public String of(String key, String value) {
                return "key=" + key + "=" + URLEncoder.encode(value, "UTF-8");
            }
        }).appendKeyVal(new Mockito.Object() {
            public String of(String key, String value) {
                return "http://other.example.com?" + value;
            }
        }).build().toString();
        assertEquals("http://other.example.com?key=value", result);
    }

}