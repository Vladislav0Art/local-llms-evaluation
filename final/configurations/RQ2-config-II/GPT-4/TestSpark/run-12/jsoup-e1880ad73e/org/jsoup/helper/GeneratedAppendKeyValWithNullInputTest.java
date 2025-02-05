package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValWithNullInputTest {

    @Test
    public void appendKeyValWithNullInputTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.appendnull.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(null);
    }

}