package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.jsoup.Connection.KeyVal.create;
import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValNullKeyValTest {

    @Test
    public void appendKeyValNullKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        urlBuilder.appendKeyVal(null);
    }

}