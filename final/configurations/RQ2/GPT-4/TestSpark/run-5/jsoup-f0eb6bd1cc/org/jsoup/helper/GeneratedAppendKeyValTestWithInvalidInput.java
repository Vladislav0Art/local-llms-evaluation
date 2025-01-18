package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection.KeyVal;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyValTestWithInvalidInput {

    @Test
    public void appendKeyValTestWithInvalidInput() throws UnsupportedEncodingException {
        try {
            URL inputUrl = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            KeyVal keyVal = KeyVal.create("key", "val-\u0015");
            urlBuilder.appendKeyVal(keyVal);
        } catch (MalformedURLException e) {
            Assert.fail(e.getMessage());
        }
    }

}