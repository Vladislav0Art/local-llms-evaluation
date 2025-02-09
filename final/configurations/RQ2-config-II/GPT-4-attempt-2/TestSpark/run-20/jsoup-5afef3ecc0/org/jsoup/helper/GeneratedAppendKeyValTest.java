package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL testURL = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testURL);
        Connection.KeyVal keyVal = Connection.KeyVal.create("testKey", "testValue");

        urlBuilder.appendKeyVal(keyVal);
        URL outcomeURL = urlBuilder.build();

        Assert.assertEquals("http://example.com?testKey=testValue", outcomeURL.toString());
    }

}