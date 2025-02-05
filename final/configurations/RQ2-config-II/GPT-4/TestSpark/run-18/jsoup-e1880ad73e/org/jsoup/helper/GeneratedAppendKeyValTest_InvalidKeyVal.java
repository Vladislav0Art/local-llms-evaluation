package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedAppendKeyValTest_InvalidKeyVal {

    @Test
    public void appendKeyValTest_InvalidKeyVal() throws UnsupportedEncodingException, MalformedURLException {
        URL validInputUrl = new URL("https://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(validInputUrl);
        Connection.KeyVal invalidKeyVal = Connection.KeyVal.create("key", "€");

        urlBuilder.appendKeyVal(invalidKeyVal);
    }

}