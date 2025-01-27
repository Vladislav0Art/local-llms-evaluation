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
import java.util.Map;

import org.jsoup.Connection.KeyVal;

public class GeneratedAppendKeyValWithNonEmptyValue {

    @Test
    public void appendKeyValWithNonEmptyValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(null);

        try {
            urlBuilder.appendKeyVal(kv);
            assert true : false;
        } catch (UnsupportedEncodingException e) {
        }
    }

}