package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedAppendKeyValTest_NullKeyVal {

    @Test
    public void appendKeyValTest_NullKeyVal() throws UnsupportedEncodingException, MalformedURLException {
        URL validInputUrl = new URL("https://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(validInputUrl);

        urlBuilder.appendKeyVal(null);
    }

}