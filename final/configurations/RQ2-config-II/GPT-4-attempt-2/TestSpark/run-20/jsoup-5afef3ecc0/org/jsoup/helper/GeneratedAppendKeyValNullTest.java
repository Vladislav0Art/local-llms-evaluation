package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyValNullTest {

    @Test
    public void appendKeyValNullTest() throws MalformedURLException, UnsupportedEncodingException {
        URL testURL = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testURL);

        urlBuilder.appendKeyVal(null);
    }

}