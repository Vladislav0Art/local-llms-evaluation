package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection.KeyVal;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValTestWithException {

    @Test
    public void appendKeyValTestWithException() throws UnsupportedEncodingException, URISyntaxException, MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        KeyVal kv = new KeyVal("key", "val", null);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
    }

}