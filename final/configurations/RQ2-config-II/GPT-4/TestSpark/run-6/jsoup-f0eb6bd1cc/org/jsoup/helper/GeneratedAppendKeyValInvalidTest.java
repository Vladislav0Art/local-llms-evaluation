package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValInvalidTest {

    @Test
    public void appendKeyValInvalidTest() throws UnsupportedEncodingException {
        try {
            URL inputUrl = new URL("http://example.com");
            UrlBuilder builder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = Connection.KeyVal.create("Key", "\uD83D\uDE00");
            builder.appendKeyVal(kv);
        } catch (MalformedURLException e) {
            Assert.fail();
        }
    }

}