package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedAppendKeyValValidTest {

    @Test
    public void appendKeyValValidTest() {
        try {
            URL inputUrl = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
            urlBuilder.appendKeyVal(keyVal);
            Assert.assertTrue(urlBuilder.build().toString().contains("key=value"));
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            Assert.fail(e.getMessage());
        }
    }

}