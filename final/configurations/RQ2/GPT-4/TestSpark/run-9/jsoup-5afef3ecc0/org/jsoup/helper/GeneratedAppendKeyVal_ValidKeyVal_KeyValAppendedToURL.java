package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyVal_ValidKeyVal_KeyValAppendedToURL {

    @Test
    public void appendKeyVal_ValidKeyVal_KeyValAppendedToURL() {
        try {
            URL url = new URL("http://www.google.com");
            UrlBuilder builder = new UrlBuilder(url);
            Connection.KeyVal kv = Connection.KeyVal.create("testKey", "testValue");
            builder.appendKeyVal(kv);
            URL builtURL = builder.build();
            Assert.assertTrue(builtURL.toString().contains("testKey=testValue"));
        } catch (UnsupportedEncodingException ex) {
            Assert.fail("UnsupportedEncodingException should not have been thrown.");
        } catch (MalformedURLException e) {
            Assert.fail("MalformedURLException should not have been thrown.");
        }
    }

}