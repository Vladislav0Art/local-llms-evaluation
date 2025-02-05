package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValNullValueTest {

    @Test
    public void appendKeyValNullValueTest() throws UnsupportedEncodingException {
        URL initialUrl;
        try {
            initialUrl = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(initialUrl);
            urlBuilder.appendKeyVal(null);
        } catch (MalformedURLException e) {
            Assert.fail();
        }
    }

}