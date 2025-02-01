package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedDecodePartUnsupportedEncodingExceptionTest {

    @Test
    public void decodePartUnsupportedEncodingExceptionTest() throws MalformedURLException {
        URL url = new URL("http://abc.com?query=value%E5");
        new UrlBuilder(url).build();
    }

}