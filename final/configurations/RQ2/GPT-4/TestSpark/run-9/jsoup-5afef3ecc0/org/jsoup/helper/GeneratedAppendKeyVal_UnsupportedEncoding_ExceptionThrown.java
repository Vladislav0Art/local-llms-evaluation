package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyVal_UnsupportedEncoding_ExceptionThrown {

    @Test
    public void appendKeyVal_UnsupportedEncoding_ExceptionThrown() throws UnsupportedEncodingException {
        URL url;
        try {
            url = new URL("http://www.google.com");
            UrlBuilder builder = new UrlBuilder(url);
            Connection.KeyVal kv = Connection.KeyVal.create("testKey", "\uFFFF");
            builder.appendKeyVal(kv);
        } catch (MalformedURLException e) {
            Assert.fail("MalformedURLException should not have been thrown.");
        }
    }

}