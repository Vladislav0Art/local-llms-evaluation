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

public class GeneratedAppendKeyValEmpty {

    @Test
    public void appendKeyValEmpty() throws UnsupportedEncodingException, MalformedURLException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        String result = builder.appendKeyVal(new Mockito.Object() {
            public String of(String key, String value) {
                return "";
            }
        }).appendKeyVal(new Mockito.Object() {
            public String of(String key, String value) {
                return "value";
            }
        }).build().toString();
        assertNotNull(result);
    }

}