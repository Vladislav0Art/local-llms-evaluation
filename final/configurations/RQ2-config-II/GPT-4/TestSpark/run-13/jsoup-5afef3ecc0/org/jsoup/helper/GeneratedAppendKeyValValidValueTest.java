package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValValidValueTest {

    @Test
    public void appendKeyValValidValueTest() {
        try {
            URL initialUrl = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(initialUrl);
            Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
            urlBuilder.appendKeyVal(keyVal);
            URL urlWithQuery = urlBuilder.build();
            Assert.assertEquals("https://www.google.com?key=value", urlWithQuery.toString());
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            Assert.fail();
        }
    }

}