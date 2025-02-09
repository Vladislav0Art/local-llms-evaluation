package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyValUnsupportedEncodingTest {

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws MalformedURLException, UnsupportedEncodingException {
        URL testURL = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testURL);
        Connection.KeyVal keyVal = Connection.KeyVal.create("测试", "价值");

        urlBuilder.appendKeyVal(keyVal);
    }

}