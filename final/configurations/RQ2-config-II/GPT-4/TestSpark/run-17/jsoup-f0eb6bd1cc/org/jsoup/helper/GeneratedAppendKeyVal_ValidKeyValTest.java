package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyVal_ValidKeyValTest {

    @Test
    public void appendKeyVal_ValidKeyValTest() throws UnsupportedEncodingException {
        URL url = null;
        try {
            url = new URL("https://example.com");
        } catch (MalformedURLException mue) {
            Assert.fail(mue.getMessage());
        }
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(keyVal);
    }

}